import java.util.Scanner;

public class MaxTheDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean[] check = new boolean[n];
        int count = 0;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        fun(arr, n, check, count, answer);
        System.out.println(max);
    }

    static int max = Integer.MIN_VALUE;

    public static void fun(int[] arr, int n, boolean[] check, int count, int[] answer) {
        int sum = 0;
        //base case
        if (count >= n) {
            // 식 만들기
            for (int i = 0; i < n - 1; i++) {
                int add1 = answer[i];
                int add2 = answer[i + 1];
                int merge = add1 - add2; // 뺀값
                sum += java.lang.Math.abs(merge); // 뺸값을 더하기
            }
            max = java.lang.Math.max(sum, max);
            return;
        }


        //recursive case
        for (int i = 0; i < n; i++) {
            if (check[i]) {
                continue;
            }
            check[i] = true;
            answer[count] = arr[i];
            fun(arr, n, check, count + 1, answer);
            check[i] = false;
            answer[count] = 0;
        }
    }
}
