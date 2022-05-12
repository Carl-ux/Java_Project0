import java.util.Arrays;
import java.util.Scanner;

public class democracyTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num_group = scan.nextInt();
        int[] group = new int[num_group];
        int num = 0;
        for(int i = 0;i < num_group; i++)
            group[i] = scan.nextInt();
        Arrays.sort(group);
        for(int i = 0;i< num_group/2 + 1;i++)
            num += group[i]/2 + 1;
        System.out.print(num);
    }
}
