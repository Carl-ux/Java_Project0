//1.Java类及类的成员：属性 方法 构造性 代码块 内部类
//2.面向对象三大特征：封装性 继承性 多态性
//3.其它关键字：this super static final abstract interface package import等

/*
 * 属性 = 成员变量 = field
 * 方法 = 成员方法 = method = 函数
 */


//测试类
public class PersonTest {
    public static void main(String[] args){
        //创建Person类的对象  实例化
        Person p1 = new Person();
        //调用属性与方法
        p1.name = "Carl";
        p1.isMale = true;
        p1.talk("Eng");
        Person p2 = p1;        //引用传递   地址值赋给p2  p1和p2指向堆中同一对象实体
        p2.name = "carl ux";   //p1随之改变
        System.out.println(p1.name);

    }
}


class Person{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void talk(String language){
        System.out.println("talk in " + language);

    }
}

