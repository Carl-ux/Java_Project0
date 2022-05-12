import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;
//对象序列化
public class serialTest {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        FileOutputStream file_out_stm = new FileOutputStream("dict.dic");
        ObjectOutputStream obj_out_stm = new ObjectOutputStream(file_out_stm);
        FileInputStream file_in_stm = new FileInputStream("dict.dic");
        ObjectInputStream obj_in_stm = new ObjectInputStream(file_in_stm);
        Person person1 = new Person("Carl","male","hey man",2002,06,20);
        Book book1 = new Book("Thinking",person1,100);
        Person person2 = new Person("angle","female","hey girl",2002,06,20);
        Book book2 = new Book("CSapp",person2,221);

        obj_out_stm.writeObject(book1);
        obj_out_stm.writeObject(book2);

        obj_out_stm.flush();

        //使用readObject()方法读取对象
        for(int i = 1;i <= n;i++){
            Book book_n = (Book) obj_in_stm.readObject();
            if(i == n)
                System.out.println(book_n);
        }
    }
}

class Book implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    private Person author;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book() {

    }

    public Book(String name,Person author,int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nauthor: " + author + "\nprice: " + price ;
    }

}


class Person implements Serializable{

    private static final long serialVersionUID = 1L;
    private String name ;
    private String gender ;
    private LocalDate birthday ;
    private String biography ;

    public Person() {

    }

    public Person(String name , String gender , String biography ,
                  int year , int month ,int day) {
        this.name = name ;
        this.gender = gender ;
        this.biography = biography ;
        this.birthday = LocalDate.of(year , month , day) ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public String getBiography() {
        return biography;
    }
    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "name: " + name + " , gender: " + gender + " , birthday: "
                + birthday + " , biography: " + biography ;
    }
}


