import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.*;
//压缩文件处理
public class zipTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        ZipEntry zipEntry = null;
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("dict.zip"));
        while((zipEntry = zipInputStream.getNextEntry()) != null)
        {
            if(i == n){
            System.out.println(zipEntry.getName());
            break;
            }
            i++;
        }
    }
}
