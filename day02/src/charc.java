public class charc {
    public static void main(String[] args){
        char c1 = 'a';
        System.out.println(c1);

        char c2 = '1';
        char c3 = '中';
        char c4 = '&';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        char c5 = '\t';  //制表符
        System.out.print("hello" + c5);
        System.out.println("world");

        char c6 = '\u0123';
        System.out.println(c6);
//直接使用unicode值
        char c7 = '\u0043';
        System.out.println(c7);

        //4. 布尔型：boolean
        //① 只能取两个值之一：true 、false
        //② 常常在条件判断、循环结构中使用
        boolean bb1 = true;
        System.out.println(bb1);

        boolean isMarried = true;
        if(isMarried){
            System.out.println("禁止入内！");
        }else{
            System.out.println("可以参观！");
        }
    }
}

/*

Java中char 型数据用来表示通常意义上“字符”(2字节)  C语言中为 1字节

- 字符常量是用单引号(‘ ’)括起来的单个字符。例如：char c1 = ‘a’; char c2 = ‘中’; char c3 = ‘9’;
- Java中还允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。例如：char c3 = ‘\n’; ‘\n’表示换行符

 */


/*
-有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
-byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型。
char、byte、short-->int-->long-->float-->double

-boolean类型不能与其它数据类型运算。

-当把任何基本数据类型的值和字符串(String)进行连接运算时(+)，基本数据类型的值将自动转化为字符串(String)类型。


 */

