import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args){
        //Arrays工具类的使用   java.util.Arrays
        //1.boolean equals(int[] a,int[] b):判断两个数组是否相等
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,2,3,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);
        //ctrl + mouse1点击方法查看源码

        //2.String toString(int[] a):输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3.void fill(int[] a,int val):将指定的值填充到数组之中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //4.void sort(int[] a):排序数组升序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5.int binarySearch(int[] a,int key):二分查找
        int[] arr3 = new int[]{-98,-34,2,34,56,88,900,1222};
        int index = Arrays.binarySearch(arr3,900);
        System.out.println(index);
    }
}
