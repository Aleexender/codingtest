import java.util.Arrays;
import java.util.Scanner;

public class PuttingBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] cache = new int[1001][1001];
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int fun = fun(arr, 0, 0 , cache);
        System.out.println(fun);
    }

    public static int fun(int[] arr, int index, int preVal, int[][] cache) {
        int correct = 0;
        int inCorrect = 0;
        // base case
        if (index == arr.length) {
            return 0;
        }
        //cache hit
        if (cache[index][preVal] != -1) {
            return cache[index][preVal];
        }

        //recursive case
        if (preVal < arr[index]){
            correct = fun(arr, index + 1, arr[index], cache) + 1;
        }
        inCorrect = fun(arr, index + 1, preVal, cache);

        int max = Math.max(correct, inCorrect);
        cache[index][preVal] = max;

        return max;
    }
}
