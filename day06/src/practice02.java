import java.util.Scanner;
public class practice02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int num = scan.nextInt();

        int[] str = new int[num];
        System.out.println("请输入" + num + "个成绩");

        int maxnum=0;
        for(int i=0;i<num;i++){
            str[i] = scan.nextInt();
            if(maxnum < str[i])
                maxnum = str[i];
        }
        System.out.println("最高分是：" + maxnum);

        char Grade;
        for(int i=0;i<num;i++){
            if(maxnum - str[i] <= 10){
                Grade = 'A';
            }else if(maxnum - str[i] <= 20){
                Grade = 'B';
            }else if(maxnum - str[i] <= 30){
                Grade = 'C';
            }else{
                Grade = 'D';
            }

            System.out.println("student " + i + " score is " + str[i] + " grade is " + Grade);
        }
    }
}
