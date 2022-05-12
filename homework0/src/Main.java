import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int time;
        int option;
        int i;
        time = scan.nextInt();
        StudentManager student_list = new StudentManager(time);

        String id;
        String name;
        int score_math;
        int score_english;
        int score_java;
        for( i = 0;i < time; i++)
        {
            option = scan.nextInt();
            switch (option){
                case 1:{
                    id = scan.next();
                    name = scan.next();
                    score_math = scan.nextInt();
                    score_english = scan.nextInt();
                    score_java = scan.nextInt();
                    if(student_list.student_search(student_list,id) )
                        System.out.println("Students already exist");
                    else {
                        student_list.student_Add(id, name, score_math, score_english, score_java);
                        System.out.println("Add success");
                    }
                    break;
                }

                case 2:{
                    id = scan.next();
                    if(!student_list.student_search(student_list, id))
                        System.out.println("Students do not exist");
                    else{
                        student_list.student_del(student_list,id);
                        System.out.println("Delete success");
                    }
                    break;
                }

                case 3:{
                    id = scan.next();
                    score_math = scan.nextInt();
                    score_english = scan.nextInt();
                    score_java = scan.nextInt();
                    if(!student_list.student_search(student_list, id))
                        System.out.println("Students do not exist");
                    else{
                        student_list.student_update(student_list,id,score_math, score_english, score_java);
                        System.out.println("Update success");
                    }
                    break;
                }

                case 4:{
                    id = scan.next();
                //    System.out.println(id);
                    if(!student_list.student_search(student_list, id))
                        System.out.println("Students do not exist");
                    else{
                        student_list.student_show(student_list,id);
                    }
                    break;
                }
            }
        }

    }
}

class Student{
    String id;
    String name;
    int score_math;
    int score_english;
    int score_java;

    public Student(){

    }

    public Student(String id,String name,int score_math,int score_english,int score_java){
        this.id = id;
        this.name = name;
        this.score_math = score_math;
        this.score_english = score_english;
        this.score_java = score_java;
    }

}

class StudentManager{
    public Student[] stu_list;
    public StudentManager(int len){
        stu_list = new Student[len];
    }
    public int index = 0;

    boolean student_search(StudentManager manager,String id)
    {
        for(int i = 0;i < index;i++) {
          //  System.out.println(manager.stu_list[i].id);
          //  System.out.println(id);
            if (id.equals(manager.stu_list[i].id)) return true;
        }
        return false;
    }

    void student_Add(String id,String name,int score_math,int score_english,int score_java)
    {
        stu_list[index] = new Student(id,name,score_math,score_english,score_java);
        index ++;
    }

    void student_del(StudentManager manager,String id)
    {
        int i;
        for( i = 0;i < index;i++)
            if(id.equals(manager.stu_list[i].id)) break;
        manager.stu_list[i].id = "0";
    }

    void student_update(StudentManager manager,String id,int score_math,int score_english,int score_java)
    {
        int i;
        for( i = 0;i < index;i++)
            if(id.equals(manager.stu_list[i].id)) break;
        manager.stu_list[i].score_math = score_math;
        manager.stu_list[i].score_english = score_english;
        manager.stu_list[i].score_java = score_java;
    }

    void student_show(StudentManager manager,String id)
    {
        int i;
        for( i = 0;i < index;i++)
            if(id.equals(manager.stu_list[i].id)) break;
        System.out.println("Student ID:"+manager.stu_list[i].id);
        System.out.println("Name:"+manager.stu_list[i].name);
        double ave = (manager.stu_list[i].score_math+manager.stu_list[i].score_english+manager.stu_list[i].score_java) / 3.0;
        System.out.println("Average Score:"+String.format("%.1f",ave));
    }
}