import java.util.Arrays;
import java.util.Scanner;

public class WineStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        int[][] cache = new int[arr.length][3];
        int adjustLimit = 2;

        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        int fun = fun(arr, adjustLimit, 0, cache);
        System.out.println(fun);


    }

    private static int fun(int[] arr, int adjustLimit, int index, int[][] cache) {

        //base case

        if (arr.length - 1 < index) {
            return 0;
        }

        if(cache[index][adjustLimit] != -1 ) {// cache hit
            return cache[index][adjustLimit];
        }


        //recursive case
        int selected = 0;

        if (adjustLimit != 0) {
            selected = arr[index] + fun(arr, adjustLimit - 1, index + 1, cache);// when I choose current Index
        }
        int unSelected = fun(arr, 2, index + 1, cache); // when I did not choose current Index

        int max = java.lang.Math.max(selected, unSelected);
        cache[index][adjustLimit] = max;

        return max;

    }
}
