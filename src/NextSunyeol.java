import java.util.Arrays;
import java.util.Scanner;

public class NextSunyeol {
    public static void main(String[] args) {
        /*
        Recursive

        선택하거나 안하거나

        +1 하거나 안하거나

        백트래킹
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean[] isVisited = new boolean[n + 1];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        var val = arr[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (val == arr[i]) {
                count++;
            }
            val--;
        }

        if (count == n) {
            System.out.println("-1");
            return;
        }

        fun(arr, n, 0, answer, isVisited,false); // 이거의 아웃풋은 1 2 4 3

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }

    public static int count = 0;

    private static int[] fun(int[] arr, int n, int index, int[] answer, boolean[] isVisited, boolean isWin) {
        //base case
        if (index >= n) {
            count++;
            if (count == 1) {
                return null;
            }
            return answer;
        }

        if(isWin){
            for (int i = 1; i < isVisited.length; i++) {
                if(!isVisited[i]){
                    answer[index] = i;
                    isVisited[i] = true;
                    return fun(arr, n, index + 1, answer, isVisited, true);
                }
            }
        }else{
            for (int i = arr[index]; i <= n; i++) {
                if (isVisited[i]) {
                    continue;
                }
                isVisited[i] = true;
                answer[index] = i;
                var ans = fun(arr, n, index + 1, answer, isVisited,arr[index] < i);
                isVisited[i] = false;
                if (ans != null) {
                    return answer;
                }
            }
        }

        return null;
    }
}
