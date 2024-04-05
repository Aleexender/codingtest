import java.util.Scanner;

public class LayingDownBridge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] cache = new int[32][32];

        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[0].length; j++) {
                cache[i][j] = -1;
            }
        }

        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();


            System.out.println(fun(n, m,cache));

        }
    }

    private static int fun(int n, int m, int[][] cache) {
        // baseCase
        int total = 0;

        if (cache[n][m] != -1) { // cache hit
            return cache[n][m];
        }

        // cache miss
        if (1 == n) {
            return m;
        } else if (0 == m) {
            return 0;
        } else if (n == m) {
            return 1;
        }

        // recursive case
        for (int i = 1; i <= m; i++) {
            total += fun( n-1, m-i,cache);
        }
        cache[n][m] = total;
        return total;
    }
}
