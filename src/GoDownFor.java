import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GoDownFor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int rowLength = Integer.parseInt(input);
        int[][] arr = new int[rowLength][3];
        int[][] cacheMax = new int[rowLength][3];
        int[][] cacheMin = new int[rowLength][3];


        for (int i = 0; i < arr.length; i++) {
            String s = bufferedReader.readLine();
            String[] s1 = s.split(" ");
            for (int j = 0; j < s1.length; j++) {
                arr[i][j] = Integer.parseInt(s1[j]);
            }
        }
        // base case
        cacheMax[arr.length -1][0] = arr[arr.length - 1][0];
        cacheMax[arr.length - 1][1] = arr[arr.length - 1][1];
        cacheMax[arr.length - 1][2] = arr[arr.length - 1][2];

        cacheMin[arr.length -1][0] = arr[arr.length - 1][0];
        cacheMin[arr.length - 1][1] = arr[arr.length - 1][1];
        cacheMin[arr.length - 1][2] = arr[arr.length - 1][2];


        //recursive case

        for (int i = arr.length - 2; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                if (j == 0){ // left
                    cacheMax[i][0] =java.lang.Math.max(cacheMax[i + 1][0], cacheMax[i + 1][1]) + arr[i][0];
                    cacheMin[i][0] =java.lang.Math.min(cacheMin[i + 1][0], cacheMin[i + 1][1]) + arr[i][0];


                } else if (j == 1) { // mid
                    cacheMax[i][1] = java.lang.Math.max(java.lang.Math.max(cacheMax[i + 1][0], cacheMax[i + 1][1]), cacheMax[i + 1][2]) + arr[i][1];
                    cacheMin[i][1] = java.lang.Math.min(java.lang.Math.min(cacheMin[i + 1][0], cacheMin[i + 1][1]), cacheMin[i + 1][2]) + arr[i][1];

                } else { // right
                    cacheMax[i][2] = java.lang.Math.max(cacheMax[i + 1][1], cacheMax[i + 1][2]) + arr[i][2];
                    cacheMin[i][2] = java.lang.Math.min(cacheMin[i + 1][1], cacheMin[i + 1][2]) + arr[i][2];
                }
            }
        }


        int max =
            java.lang.Math.max(java.lang.Math.max(cacheMax[0][0], cacheMax[0][1]), cacheMax[0][2]);

        int min =
            java.lang.Math.min(java.lang.Math.min(cacheMin[0][0], cacheMin[0][1]), cacheMin[0][2]);

        System.out.println(max + " " + min);


    }
}
