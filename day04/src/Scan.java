import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否单身？(true/false)");
        boolean isLive = scan.nextBoolean();
        System.out.println(isLive);

        //char型的获取，Scanner没有提供相关方法，只能获取一个字符串
        System.out.println("请输入你的性别：(男/女)");
        String TF = scan.next();
        char TFChar = TF.charAt(0);   //获取索引为0位置的字符
        System.out.println(TFChar);
    }
}
