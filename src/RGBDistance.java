import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class RGBDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int[][] arr = new int[input][3];
        int[][] cache = new int[input][3];

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                arr[i][k] = scanner.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int a = arr[arr.length - 1][i] + fun(arr, i, input - 2, cache);
            min = java.lang.Math.min(min, a);

        }
        Set<Integer> set = new HashSet<>();
        set.add()
        System.out.println(min);
    }

    private static int fun(int[][] arr, int bannedIndex, int input, int[][] cache) {
        //base case

        // cache hit
        if (cache[input][bannedIndex] != 0) {
            return cache[input][bannedIndex];
        }
        if(input == 0){
            if(bannedIndex == 0){
                int save = java.lang.Math.min(arr[input][1], arr[input][2]);
                cache[input][bannedIndex] = save;
                return save;
            } else if (bannedIndex == 1) {
                int save = java.lang.Math.min(arr[input][2], arr[input][0]);
                cache[input][bannedIndex] = save;
                return save;
            } else {//2
                int save = java.lang.Math.min(arr[input][0], arr[input][1]);
                cache[input][bannedIndex] = save;
                return save;
            }
        }


        //recursive case
        if(bannedIndex == 0){
            int min = java.lang.Math.min(arr[input][1] + fun(arr, 1, input - 1, cache),
                arr[input][2] + fun(arr, 2, input - 1, cache));
            cache[input][bannedIndex] = min;
            return min;
        } else if (bannedIndex == 1) {
            int min = java.lang.Math.min(arr[input][0] + fun(arr, 0, input - 1, cache),
                arr[input][2] + fun(arr, 2, input - 1, cache));
            cache[input][bannedIndex] = min;
            return min;
        }else{ // 2
            int min = java.lang.Math.min(arr[input][1] + fun(arr, 1, input - 1, cache),
                arr[input][0] + fun(arr, 0, input - 1, cache));
            cache[input][bannedIndex] = min;
            return min;
        }
    }
}
