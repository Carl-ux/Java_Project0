/*
 * 类中属性的使用
 *
 * 属性（成员变量） vs 局部变量
 * 属性：直接定义在类的一对{}里
 * 局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 *
 * 权限修饰符
 * 属性可以在声明时使用权限修饰符指明其权限
 * private public 缺省 protected
 *
 *
 * 默认初始化值
 * 属性：根据其类型都有默认初始化值
 *      整型(byte short int long):0
 *      浮点型(float double):0.0
 *      字符型(char):0(或'\u0000')
 *      布尔型(boolean):false
 *
 *      引用数据类型(class interface array):null
 *
 *
 * 局部变量：无默认初始化值 必须显示赋值
 * 形参调用时，只需赋值即可
 *
 *
 * 属性加载到堆空间（非static)  局部变量加载到栈空间
 *
 * return关键字用于结束方法 以及返回数据 return后不可声明执行语句
*/
public class UserTest {
    public static void main(String[] args){

    }
}

class User{
    //属性(成员变量）
    String name;
    int age;
    boolean isMale;

    public void talk(String language) {      //language:形参
        System.out.println("talk in " + language);
    }

    public void eat(){
        String food = "烙饼";   //局部变量
        System.out.println("北方人喜欢吃" + food);
    }
}