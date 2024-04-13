import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testTime = scanner.nextInt();
        int[][] apart = new int[15][15];

        for (int i = 0; i < apart.length; i++) {
            for (int k = 1; k < apart[0].length; k++) {
                if (i == 0) {
                    apart[i][k] = k;
                } else {
                    for (int m = 1; m <= k; m++) {
                        apart[i][k] += apart[i - 1][m];
                    }
                }
            }
        }



        for (int i = 0; i < testTime; i++) {
            int floor = scanner.nextInt();
            int ho = scanner.nextInt();


            System.out.println(apart[floor][ho]);
        }
    }
}
