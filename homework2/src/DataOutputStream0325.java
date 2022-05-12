import java.io.*;

/**
 * @Author: lishi
 * @Description:
 * @Date: Create in 18:40 2019/3/25
 */
public class DataOutputStream0325 {
    public static void main(String args[]) throws Exception{    // 所有异常抛出
        DataOutputStream dos = null ;            // 声明数据输出流对象
        File f = new File("dict.dic") ; // 文件的保存路径
        dos = new DataOutputStream(new FileOutputStream(f)) ;    // 实例化数据输出流对象
        String names[] = {"衬衣","手套","围巾"} ;    // 商品名称
        float prices[] = {98.3f,30.3f,50.5f} ;        // 商品价格
        int nums[] = {3,2,1} ;    // 商品数量
        for(int i=0;i<names.length;i++){    // 循环输出
            dos.writeChars(names[i]) ;    // 写入字符串，注意，这边少数writeChars()，不是writechar()。
            dos.writeChar('\t') ;    // 写入分隔符，这边是读取writechar()。
            dos.writeFloat(prices[i]) ; // 写入价格
            dos.writeChar('\t') ;    // 写入分隔符
            dos.writeInt(nums[i]) ; // 写入数量
            dos.writeChar('\n') ;    // 换行
        }
        dos.close() ;    // 关闭输出流


        DataInputStream dis = null ;        // 声明数据输入流对象
        //      File f = new File("d:" + File.separator + "order.txt") ; // 文件的保存路径
        dis = new DataInputStream(new FileInputStream(f)) ;    // 实例化数据输入流对象
        String name = null ;    // 接收名称
        float price = 0.0f ;    // 接收价格
        int num = 0 ;    // 接收数量
        char temp[] = null ;    // 接收商品名称
        int len = 0 ;    // 保存读取数据的个数
        char c = 0 ;    // '\u0000'
        try{
            while(true){
                temp = new char[200] ;    // 开辟空间
                len = 0 ;
                while((c=dis.readChar())!='\t'){    // 接收内容，因为直到读取到'\t'才完成了读取一个字符串，未读取到表示还有内容。
                    temp[len] = c ;
                    len ++ ;    // 读取长度加1
                }
                name = new String(temp,0,len) ;    // 将字符数组变为String
                price = dis.readFloat() ;    // 读取价格
                dis.readChar() ;    // 读取\t
                num = dis.readInt() ;    // 读取int
                dis.readChar() ;    // 读取\n
                System.out.printf("名称：%s；价格：%5.2f；数量：%d\n",name,price,num) ;
            }
        }catch(Exception e){}
        dis.close() ;
    }
}