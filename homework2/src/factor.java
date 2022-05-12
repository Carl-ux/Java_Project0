import java.util.*;
import java.io.*;

public class factor {
    public static void main(String[] args) throws IOException {
        int a ;
        boolean b = true ;
        double c , f ;
        String d ;
        DataOutputStream out = new DataOutputStream( new FileOutputStream("dict.dic"));
        Scanner cin = new Scanner(System.in);

        for (int i = 0 ; i < 2 ; i ++ ) {
            a = cin.nextInt() ;
            f = Math.random() ;
            if ( f > 0.5 ) b = true ;
            else b = false ;
            c = cin.nextDouble() ;
            d = cin.next() ;
            out.writeInt(a);
            out.writeBoolean(b);
            out.writeDouble(c);
            out.writeUTF(d);
        }

        out.close(); // Remember this!
        cin.close();
    }
}
