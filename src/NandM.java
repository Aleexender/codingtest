import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NandM {
    public static void main(String[] args) {
        /*
        1. 4
         */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean[] visit = new boolean[n];
        List<Integer> list = new ArrayList<>();
        int start = 0;

        fun(n,m,visit,start,list);




    }
    //  1~4
    public static void fun(int n, int m, boolean[] visit, int select, List<Integer> gather) {
        // base case
        if (select == m){

            for (Integer a : gather) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        // recursive case
        for (int i = 0; i < n; i++) { // 1을 선택하고 2,3,4를 돈다
            if (visit[i]) {
                continue;
            }
            visit[i] = true;
            gather.add(i + 1);
            fun(n, m, visit, select + 1, gather);
            visit[i] = false;
            gather.remove(gather.size()-1);
        }



    }
}
