import java.util.*;
public class insert {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i,j,num;
        int tmp;
        int[] arr = new int[n];
        for(i = 0;i < n; i++)
            arr[i] = scan.nextInt();
        for(i = 1;i < n; i++)
        {
            for(j = i;j > 0; j--)
            {
                if(arr[j] < arr[j - 1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
            for(j = 0;j < n-1; j++)
                System.out.print(arr[j] + " ");
            System.out.println(arr[j]);
        }
    }
}
