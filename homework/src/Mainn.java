import java.util.*;

public class Mainn {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        try{
            N = scan.nextInt();
        }catch (Exception ex){
            System.out.println("Input data error");
            return;
        }
        if(N < 1||N > 50)
        {
            System.out.println("Input data error");
            return;
        }
        else {
            int[][] arr = new int[N][N];
            int i,j;
            int val = 1;
            int up = 0;
            int down = N-1;
            int left = 0;
            int right = N-1;
            while(true)
            {
                for (i = up; i <= down; i++)
                    arr[i][right] = val++;
                right--;
                if(right < left) break;

                for(i = right; i >= left; i--)
                    arr[down][i] = val++;
                down--;
                if(down < up) break;

                for(i = down; i >= up; i--)
                    arr[i][left] = val++;
                left++;
                if(left > right) break;

                for(i = left; i<=right; i++)
                    arr[up][i] = val++;
                up++;
                if(up > down) break;
            }

//            System.out.println("N=" + N);
            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    if(j == 0)
                        System.out.print((arr[i][j]));
                    else
                        System.out.print(" " + arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}
