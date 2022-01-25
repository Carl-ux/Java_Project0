//string属于引用数据类型
//声明String变量时  使用一对" "
//String可以和8种基本数据类型变量做运算  且只能是连接（+）运算
//int short byte boolean long char float double
//运算的结果仍是String类型
public class string {
    public static void main(String[] args){
        String s1 = "I m Carl";
        System.out.println(s1);

        String s2 = "";
        System.out.println(s2);

//    char ''里没有字符  编译不通过

        int num1 = 1001;
        String numStr = "学号：";
        String info = numStr + num1;   //连接运算

        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info);
        System.out.println(info1);

        //练习
        char c ='a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);
        System.out.println(c + str + num);
        System.out.println(c + (num + str));
        System.out.println((c + num) + str);
        System.out.println(str+ num + c);


        String str2 = 3.5f +"";
        System.out.println(str2);  //字符串型

        float f1 = Float.parseFloat(str2);   //包装类
        System.out.println(f1);   //单精度浮点型
    }
}
