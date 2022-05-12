import java.util.Scanner;

public class complexTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();    //操作类型
        int num = scan.nextInt();    //操作次数

        for(int i = 0; i< num; i++)
        {
            double c1_real = scan.nextDouble();
            double c1_imagin = scan.nextDouble();
            double c2_real = scan.nextDouble();
            double c2_imagin = scan.nextDouble();

            Complex c = new Complex(c1_real,c1_imagin,c2_real,c2_imagin);

            if(str.equals("add"))
                c.add();
            else if(str.equals("sub"))
                c.sub();
            else if(str.equals("mul"))
                c.mul();
            else if(str.equals("div"))
            {
                try
                {
                    c.div();
                }catch (ComplexDivException e)
                {
                    e.warning();
                }
            }

        }
    }
}


class Complex {
    public double c1_real;
    public double c1_imagin;
    public double c2_real;
    public double c2_imagin;

    public Complex()
    {
    }

    public Complex(double c1_real,double c1_imagin,double c2_real,double c2_imagin)
    {
        this.c1_real = c1_real;
        this.c1_imagin = c1_imagin;
        this.c2_real = c2_real;
        this.c2_imagin = c2_imagin;
    }

    public void add()
    {
        double add_real = c1_real + c2_real;
        double add_imagin =c1_imagin + c2_imagin;
        if(add_imagin >= 0)
           System.out.println(String.format("%.1f",add_real) + "+" + String.format("%.1f",add_imagin) + "i");
        else
            System.out.println(String.format("%.1f",add_real) +  String.format("%.1f",add_imagin) + "i");

    }

    public void sub()
    {
        double sub_real = c1_real - c2_real;
        double sub_imagin =c1_imagin - c2_imagin;
        if(sub_imagin >= 0)
            System.out.println(String.format("%.1f",sub_real) + "+" + String.format("%.1f",sub_imagin) + "i");
        else
            System.out.println(String.format("%.1f",sub_real) +  String.format("%.1f",sub_imagin) + "i");

    }

    public void mul()
    {
        double mul_real = c1_real*c2_real - c1_imagin*c2_imagin;
        double mul_imagin = c1_real*c2_imagin + c1_imagin*c2_real;
        if(mul_imagin >= 0)
            System.out.println(String.format("%.1f",mul_real) + "+" + String.format("%.1f",mul_imagin) + "i");
        else
            System.out.println(String.format("%.1f",mul_real) +  String.format("%.1f",mul_imagin) + "i");

    }

    public void div()throws ComplexDivException
    {
        if(c2_real != 0 || c2_imagin != 0)
        {
            double div_real = (c1_real*c2_real + c1_imagin*c2_imagin) / (c2_real*c2_real + c2_imagin*c2_imagin);
            double div_imagin = (c1_imagin*c2_real - c1_real*c2_imagin) / (c2_real*c2_real + c2_imagin*c2_imagin);

            if(div_imagin >= 0)
                System.out.println(String.format("%.1f",div_real) + "+" + String.format("%.1f",div_imagin) + "i");
            else
                System.out.println(String.format("%.1f",div_real) +  String.format("%.1f",div_imagin) + "i");

        }
        else
        {
            throw new ComplexDivException();
        }

    }

}

class ComplexDivException extends Exception {
    String error_code = "1001";
    String error_info = "Divide by zero.";

    public ComplexDivException()
    {

    }

    public void warning()
    {
        System.out.println("Error No : " + error_code);
        System.out.println("Error Message : " + error_info);
    }
}