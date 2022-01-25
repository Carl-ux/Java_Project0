public class var {
    public static void main(String[] args){
        float f1 = 12.3F;
        System.out.println(f1);
        //一般使用double
        double d1 = 12.3;
        System.out.println(d1);

        long l1 = 10000000000000L;
        System.out.println(l1);
    }
}

class Hello1{
    public static void main(String[] args){
        int num = 111;
        System.out.println(num);
    }
}

/*
Java中的命名规范
包名：多单词组成时所有字母都小写：xxxyyyzzz
类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
 */

/*
Java定义的数据类型

一、变量按照数据类型来分：
	基本数据类型：
		整型：byte \ short \ int \ long
		byte: -128~127  2^8    1 byte =8 bit
		浮点型：float \ double
		字符型：char
		布尔型：boolean

	引用数据类型：
		类：class
		接口：interface
		数组：array

二、变量在类中声明的位置：
		成员变量 vs 局部变量


Java 的整型变量默认为 int 型，声明 long 型变量须后加‘l’或‘L’
Java 的浮点型变量默认为double型，声明float型变量，须后加‘f’或‘F’


*/