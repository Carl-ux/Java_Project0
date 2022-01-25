/*
100000以内的所有质数
质数：素数，只能被1和它本身整除的自然数。

最小的质数是：2
*/
public class Prime {
    public static void main(String[] args){
        boolean flag = true;
        int count = 0;
        long start = System.currentTimeMillis();
        //获取当前时间举例1970-01-01 00:00:00 的毫秒数
        for(int i = 2;i <= 10000;i++){
            for(int j = 2;j <= Math.sqrt(i);j++){   //Math.sqrt(i)是i的开方
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(i);
                count++;
            }
            flag = true;   //重置
        }
        long end = System.currentTimeMillis();

        System.out.println("10000内质数有" + count +"个");
        System.out.println("算法花费的时间为" + (end - start));
    }
}
