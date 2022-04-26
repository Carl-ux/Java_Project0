import java.util.*;
public class gap {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int T;
        int A,B,i;
        try {
            T = scan.nextInt();
        } catch (Exception ex) {
            System.out.println("Input data error");
            return;

        }
        if(T < 1||T > 10)
        {
            System.out.println("Input data error");
            return;
        }
        for(i = 0;i < T;i++)
        {
            try {
                A = scan.nextInt();
                B = scan.nextInt();
            } catch (Exception ex) {
                System.out.println("Input data error");
                return;

            }
            if(A < 0||A > 1018)
            {
                System.out.println("Input data error");
                return;
            }
            if(B < 0||B > 1018)
            {
                System.out.println("Input data error");
                return;
            }
            if(((A == B)&&((A + B) != 0)) || ((A - B) == 1) || ((B - A) == 1))
                System.out.println("MM");
            else
                System.out.println("GG");
        }
    }
}
