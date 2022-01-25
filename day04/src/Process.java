import java.util.Scanner;

public class Process {
    public static void main(String[] args){
        /*
        如何从键盘获取不同类型的变量，需要使用Scanner类

        具体步骤：
        1.导包：import java.util.Scanner;
        2.Scanner的实例化;
        3.调用Scanner类的相关方法，来获取指定的变量。
*/
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
    }
}
