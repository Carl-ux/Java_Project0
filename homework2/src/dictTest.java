import java.util.Scanner;
import java.io.*;
//文本文件处理
public class dictTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();
        int row = 0;
        FileReader fr = new FileReader("dict.dic");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            if(row < (opt - 1)*4)
                row++;
            else if(row >= (opt - 1)*4 && row < opt*4)
            {
                System.out.println(line);
                row++;
            }
            else
                break;
        }
    }
}
