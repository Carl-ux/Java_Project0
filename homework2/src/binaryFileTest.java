import java.util.Scanner;
import java.io.*;
//二进制文件处理
public class binaryFileTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();
        FileInputStream fis = new FileInputStream("dict.dic");   //文件流
        DataInputStream dis = new DataInputStream(fis);                //字节流

        int int_num = 0;
        boolean b = true ;
        double double_num = 0;
        String str = null;

        for(int i = 0;i < opt;i++) {
            int_num = dis.readInt();
            b = dis.readBoolean();
            double_num = dis.readDouble();
            str = dis.readUTF();
        }

        System.out.println(int_num);
        System.out.println(b);
        System.out.println(double_num);
        System.out.print(str);

    }
}
