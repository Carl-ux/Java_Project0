/*
 * 一、数组的概述
 * 1.数组的理解：数组(Array)，是多个相同类型数据按一定顺序排列的集合，
 * 并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。
 *
 * 2.数组的相关概念：
 * >数组名
 * >元素
 * >角标、下标、索引
 * >数组的长度：元素的个数
 *
 * 3.数组的特点：
 * 1)数组属于引用类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型。
 * 2)创建数组对象会在内存中开辟一整块连续的空间；
 * 3)数组的长度一旦确定，就不能修改;
 * 4)数组是有序排列的。
 *
 * 4.数组的分类：
 * 	① 按照维数：一维数组、二维数组、三维数组……
 *  ② 按照数组元素类型：基本数据类型元素的数组、引用类型元素的数组
 *
 */
public class Array {
    public static void main(String[] args){
        int[] ids;   //声明 中括号表示数组
        //1.1 静态初始化
        ids= new int[]{1001,1002,1003,1004}; //初始化
        //1.2 动态初始化
        String[] names = new String[5];

        //错误写法
        //int[] arr1 = new int[];
        //int[5] arr2 = new int[5];

        //2  角标调用
        names[0] = "Carl";
        names[1] = "Kennys";
        names[2] = "S1mple";
        names[3] = "M0neSy";
        names[4] = "Niko";

        //3  获取数组长度
        System.out.println(names.length);
        System.out.println(ids.length);

        //4  数组的遍历
        for(int i = 0;i < names.length;i++)
            System.out.println(names[i]);

        //5  数组元素的默认初始值
        /*
         * ⑤ 数组元素的默认初始化值
         * 		> 数组元素是整形：0
         * 		> 数组元素是浮点型：0.0
         * 		> 数组元素是char型：0或'\u0000'，而非'0'
         * 		> 数组元素是boolean型:false
         *
         * 		> 数组元素是引用数据类型：null
         */
        String[] arr5 = new String[5];
        System.out.println(arr5[0]);
        if(arr5[0] == null)
            System.out.println("String是引用数据类型");
    }
}
