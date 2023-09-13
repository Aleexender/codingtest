import java.util.Scanner;

public class FunRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));
        }



    }

    public static int[][][] cache = new int[51][51][51];
    public static int w(int a, int b, int c) {
        // 캐시에 있으면 꺼내오기
        // 캐시에 없으면 계산해서 값을 Cache에 대입

        //base case
        //cache hit
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (cache[a][b][c] != 0) {
            return cache[a][b][c];
        }
        //recursive case
        // cache miss
        if (a > 20 || b > 20 || c > 20) {
            return cache[a][b][c] = w(20, 20, 20);
        }

        if (a < b && b < c) {
            return cache[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            return cache[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }

    }
}
