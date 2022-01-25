import java.util.Scanner;

public class Process {
    public static void main(String[] args){
        /*
        如何从键盘获取不同类型的变量，需要使用Scanner类

        具体步骤：
        1.导包：import java.util.Scanner;
        2.Scanner的实例化;
        3.调用Scanner类的相关方法，来获取指定的变量。
*/
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);

        /*
        if-else

        条件表达式必须是布尔表达式（关系表达式或逻辑表达式）、布尔变量；
        语句块只有一条执行语句时，一对{}可以省略，但建议保留；
        if-else语句结构，根据需要可以嵌套使用；
        当if-else结构是“多选一”时，最后的else是可选的，根据需要可以省略；
        当多个条件是“互斥”关系时，条件判断语句及执行语句间顺序无所谓当多个条件是“包含”关系时，“小上大下/ 子上父下”。

         */
        String season= "summer";
        switch(season) {
            case"spring":
                System.out.println("春暖花开");
                break;
            case"summer":
                System.out.println("夏日炎炎");
                break;
            case"autumn":
                System.out.println("秋高气爽");
                break;
            case"winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("季节输入有误");
                break;
        }
        /*
        switch-case

        1.格式
        switch(表达式){
        case 常量1:
            执行语句1;
            //break;
        case 常量2:
            执行语句2;
            //break;

        ...

        default:
            执行语句n:
            //break;
        }

        2.说明:
        ① 根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，进入相应case结构中，执行相关语句。
          当调用完执行语句后，则仍然继续向下执行其他case语句，直到遇到break关键字或末尾结束为止。

        ② break, 可以使用switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构。

        ③ switch结构中的表达式，只能是如下的六种数据类型之一：byte、short、char、int、枚举类型(JDK5.0)、String类型(JDK7.0)
        ④ case 之后之能声明常量。不能声明范围。

        ⑤ break关键字是可选的。
        ⑥ default：相当于if-else结构中的else。
			default 结构是可选的，而且位置是灵活的。
         */

        /*循环
       while      for        do while
         */
        int num5 = 1;
        for(System.out.print('a');num <= 3;System.out.print('c'),num++){
            System.out.print("b");
        }
            System.out.println();

        //break  终止某个语句块的执行并跳出
        //break语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层语句块
        //break只能用于switch和循环语句

        /*
        continue只能使用在循环语句
        continue语句用于跳过其所在循环语句块的一次执行，继续下一次循环
        continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环
         */

        //continue是终止本次循环，break是终止本层循环

        //return：并非专门用于结束循环的，它的功能是结束一个方法。当一个方法执行到一个return语句时，这个方法将被结束
        //与break和continue不同的是，return直接结束整个方法，不管这个return处于多少层循环之内

        for(int i = 1;i <= 10;i++){
            if(i % 4 == 0){
                //	break;	//1、2、3
                continue;	//1、2、3、5、6、7、9、10
                //	System.out.println("该吃饭了！！！");
            }
            	System.out.print(i);
        }
        System.out.println();
        //********************************
        for(int i = 1;i <= 5;i++){

            for(int j = 1;j <= 10; j++){
                if(i % 4 == 0){
                    break;	//默认跳出包裹此关键字最近的一层的循环
                    //continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
