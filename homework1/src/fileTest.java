import java.util.*;
import java.io.*;

public class fileTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
            out.write(str1);
            out.close();
        } catch (IOException e) {
        }


        String method = scan.nextLine();
        String str2 = scan.nextLine();

        if (method.equals("r")) {
        } else if (method.equals("w+") || method.equals("w")) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
                out.write(str2);
                out.close();
            } catch (IOException e) {
            }
        }
       else if (method.equals("a") || method.equals("a+")) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
                out.write(str1 + str2);
                out.close();
            } catch (IOException e) {
            }
        }
       else if(method.equals("r+"))
        {
            if(str2.length() > str1.length())
            {
                BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
                out.write(str2);
                out.close();
            }
            else
            {
                BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
                out.write(str2 + str1.substring(str2.length()));
                out.close();
            }
        }

        try {
            BufferedReader in = new BufferedReader(new FileReader("test.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
        }

    }
}
