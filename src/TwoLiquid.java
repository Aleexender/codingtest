import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class TwoLiquid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(reader.readLine());
        int[] liquid = new int[total];

        String[] input = reader.readLine().split(" ");
        for (int i = 0; i < total; i++) {
            liquid[i] = Integer.parseInt(input[i]);
        }

        // two pointer

        Arrays.sort(liquid);

        int start = 0; // index
        int end = liquid.length - 1; // index
        int min = Integer.MAX_VALUE;
        int minLiq = 0;
        int minLiq2 = 0;

        while (start < end) {
            int value = liquid[end] + liquid[start];
            int abs = java.lang.Math.abs(value);


            if (value < 0) { // value is negative
                if (min > abs) {
                    min = abs;
                    minLiq = liquid[start];
                    minLiq2 = liquid[end];
                }
                start++;
            } else if (value > 0) { // value is positive
                if (min > abs) {
                    min = abs;
                    minLiq = liquid[start];
                    minLiq2 = liquid[end];
                }
                end--;
            } else {
                System.out.println(liquid[start] + " " + liquid[end]);
                return;
            }
        }

        System.out.println(minLiq + " " + minLiq2);
    }
}