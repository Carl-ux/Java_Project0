import java.util.*;

public class stackTest {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        List<Integer> list_p = new ArrayList<Integer>();

        int len_p = scan.nextInt();
        String p1 = "pop";
        String p2 = "push";
        String buffer = scan.nextLine();
        String s = scan.nextLine();
        String[] str = s.split(" ");
        for(i = 0; i < str.length;i++)
            list_p.add(Integer.parseInt(str[i]));

        stack S = new stack();
        S.push(list_p);

        for(i = 0;i < 2; i++)
        {
            s = scan.nextLine();
            str = s.split(" ");
            if(str[0].equals(p1)){
                S.pop(Integer.parseInt(str[1]));
            }
            else if(str[0].equals(p2)){
                list_p.clear();
                for(int j = 1;j < str.length;j++)
                    list_p.add(Integer.parseInt(str[j]));
                S.push(list_p);
            }
        }
        if(S.len != 0){
            System.out.print("len = " + S.len + ", data = ");
            for(i = 0; i < S.len - 1; i++)
                System.out.print("" + S.list.get(i) + " ");
            System.out.println(S.list.get(i));
        }
        else
            System.out.println("len = 0");

        if(S.len_pop != 0){
            System.out.print("len = " + S.len_pop + ", data = ");
            for(i = 0; i < S.len_pop - 1; i++)
                System.out.print("" + S.list_pop.get(i) + " ");
            System.out.println(S.list_pop.get(i));
        }
        else
            System.out.println("len = 0");
    }
}



class stack {
    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list_pop = new ArrayList<Integer>();

    int len = 0 ;
    int len_pop = 0;

    public stack(){

    }

    public void pop(int t){
        for(int i = 0;i < t;i++) {
            if (!list.isEmpty()) {
                list_pop.add(list.remove(--len));
                len_pop++;
            }
            else {
                len = 0;
                break;
            }
        }
    }

    public void push(List<Integer> L){
        list.addAll(L);
        len += L.size();
    }
}
