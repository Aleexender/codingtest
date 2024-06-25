import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sticker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.parseInt(bufferedReader.readLine());
        int row = 0;
        int row2 = 1;

        for (int i = 0; i < time; i++) {
            int length = Integer.parseInt(bufferedReader.readLine());
            int[][] arr = new int[2][length];
            int[][] cache = new int[2][length];

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < cache[0].length; k++) {
                    cache[j][k] = -1;
                }
            }
            for (int j = 0; j < 2; j++) {
                String s = bufferedReader.readLine();
                String[] s1 = s.split(" ");
                for (int k = 0; k < length; k++) {
                    arr[j][k] = Integer.parseInt(s1[k]);
                }
            }
            int expectedSum = fun(arr, length, row,cache);
            int expectedSum2 = fun(arr, length, row2,cache);
            System.out.println(java.lang.Math.max(expectedSum, expectedSum2));
            StringBuilder sb = new StringBuilder();
            String string = sb.toString();
        }
    }


    private static int fun(int[][] arr, int length, int row, int[][] cache) {
        //base case

        //cache hit
        if (cache[row][length-1] != -1) {
            return cache[row][length-1];
        }

        if (length == 1) {
            if(row == 0){
                return arr[0][arr[row].length - 1];
            } else {
                return arr[1][arr[row].length - 1];
            }
        }

        //recursive
        if (row == 0) {
            return cache[row][length-1] = java.lang.Math.max(
                fun(arr, length - 1, 1, cache) + arr[row][arr[row].length - length],
                fun(arr, length - 1, 0, cache));
        } else {
            return cache[row][length-1] = java.lang.Math.max(
                fun(arr, length - 1, 0, cache) + arr[row][arr[row].length - length],
                fun(arr, length - 1, 1, cache));
        }

    }

}



