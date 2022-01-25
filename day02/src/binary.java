/*
> 二进制(binary)  0b或0B开头
> 十进制(decimal)
> 八进制(octal)  0-7  以数字0开头
> 十六进制(hex) 0-9及A-F  以0x或0X开头
 */
public class binary {
    public static void main(String[] args){
        int num1 = 0b110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0x110AB;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }
}
