import java.util.Scanner;

public class FindPinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int wasOne = 0;
        long[][] cache = new long[length][2];

        if (length == 1) {
            System.out.println(1);
        } else if (length == 2) {
            System.out.println(1);
        } else {
            System.out.println(fun(length-3, 0, cache) + fun(length-3, 1, cache));
            System.out.println();

        }


    }

    private static long fun(int length, int now, long[][] cache) {
        long total = 0;
        //base case
        if (cache[length][now] != 0) {//cache hit
            return cache[length][now];
        }
        if (length == 1) {
            return 2;
        } else if (length == 2) {
            return 3;
        }


        // recursive case
        if (now == 1) {
            total += fun(length - 1, 0, cache);
        } else {
            total += fun(length - 1, 0, cache);
            total += fun(length - 1, 1, cache);
        }
        cache[length][now] = total;
        return total;
    }
}
