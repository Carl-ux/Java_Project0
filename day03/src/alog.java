public class alog {
    public static void main(String[] args){

        short s1 = 10;
        //s1 = s1 + 1 编译失败  因为1是int类型，而byte char short运算时转换为int
        s1++;
        System.out.println(s1);
        //自增自减不会改变本身变量的数据类型

        byte b1 = 127;
        b1++;
        System.out.println(b1);
        //补码

        short s2 =10;
        //s2 = s2 + 2   编译失败
        s2 += 2;
        //扩展赋值运算不会改变变量本身数据类型    开发中常用
        System.out.println(s2);

        int n =10;
        n += (n++) + (++n);
        // n = n + (n++) + (++n)
        //     10   10      12
        System.out.println(n);

        /*
    &—逻辑与
    |—逻辑或
    ！—逻辑非
    && —短路与
    ||—短路或
    ^ —逻辑异或

    逻辑与短路的区别

    区分& 与 &&
		//相同点1：& 与 && 的运算结果都相同
		//相同点2：当符号左边是true时，二者都会执行符号右边的运算
		//不同点：当符号左边是false时，&继续执行符号
		//开发中，推荐使用&&

	区分| 与 ||
		//相同点1：| 与 || 的运算结果都相同
		//相同点2：当符号左边是false时，二者都会执行符号右边的运算
		//不同点3：当符号左边是true时，|继续执行符号右边的运算，而||不再执行符号右边的运算
		//开发中，推荐使用||

*/
        boolean x = true;
        boolean y = false;
        short z = 42;
        if((z++ == 42)&&(y = true))
            z++;
        if((x = false)||(++z == 45))
            z++;
        System.out.println("z=" + z);

        //位运算符
        //位运算是直接对整数的二进制进行的运算
        /*
        << 左移
        >> 右移            高位补符号
        >>>无符号右移       高位补0
        & 与运算
        | 或运算
        ^ 异或运算
        ~ 取反运算          补码各位取反
         */
        //位运算操作类型是对数值  逻辑运算操作类型是对布尔型


        //使用位运算 交换两变量值
        int num1 = 10;
        int num2 = 20;

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("num1 =" + num1 + "\nnum2 =" + num2);

        //三元运算符
        /*
        结构：(条件表达式)？表达式1 : 表达式2

        说明
        ① 条件表达式的结果为boolean类型

        ② 如果表达式为true,则执行表达式1
          如果表达式为false,则执行表达式2

        ③ 表达式1 和表达式2要求是一致的。
        ④ 三元运算符是可以嵌套的

        3. 凡是可以使用三元运算的地方，都是可以改写if-else。
           反之，则不一定成立！！！
         */
        int num3 = 12;
        int num4 = 16;
        int max = (num3 > num4)? num3 : num4;
        System.out.println(max);
    }
}
