public class Memory {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3};
        String[] arr1 = new String[4];
        arr1[1] = "Carl";
        arr1[2] = "Kennys";
        arr1 = new String[3];
        System.out.println(arr1[1]);

        //结果为null
        //arr1的值已经指向新的数组
        //栈空间中arr1变量指向堆中新声明的数组
    }
}
