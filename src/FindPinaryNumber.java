import java.util.Scanner;

public class FindPinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        long[][] cache = new long[length][2];

        if (length == 1) {
            System.out.println(1);
        } else if (length == 2) {
            System.out.println(1);
        } else {
            System.out.println(fun(length - 2, 0, cache));
        }


    }

    private static long fun(int length, int wasOne, long[][] cache) {
        long total = 0;
        //base case
        if (cache[length][wasOne] != 0) {//cache hit
            return cache[length][wasOne];
        }


        if (length == 1 && wasOne == 1) {
            return 1;
        } else if (length == 1 && wasOne == 0) {
            return 2;
        } else if (length == 2 && wasOne == 1) {
            return 2;
        } else if (length == 2 && wasOne == 0) {
            return 3;
        }


        // recursive case
        if (wasOne == 1) {
            total += fun(length - 1, 0, cache);
        } else {
            total += fun(length - 1, 0, cache);
            total += fun(length - 1, 1, cache);
        }
        cache[length][wasOne] = total;
        return total;
    }
}
