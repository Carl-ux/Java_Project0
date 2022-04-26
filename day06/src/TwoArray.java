public class TwoArray {
    public static void main(String[] args){
        //二维数组声明和初始化
        int[] arr1 = new int[]{1,2,3};    //一维

        int[][] arr2 = new int[][]{{1,2,3},{4,5},{6,7,8}};   //二维静态初始化

        String[][] arr3 = new String[3][2];     //二维动态初始化
        String[][] arr4 = new String[3][];     //二维动态初始化

        //调用数组指定位置的元素
        System.out.println(arr2[0][1]);   //2
        System.out.println(arr3[1][1]);   //null
        //  System.out.println(arr4[1][1]);    //报错

        arr4[1] = new String[4];
        System.out.println(arr3[1][0]);

        //获取数组的长度

    }
}