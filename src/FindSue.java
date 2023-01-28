import java.util.Scanner;

public class FindSue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String change = scanner.next();
        String[] t = new String[N];
        t = change.split(",");
        int[] num = new int[N];

        for (int j = 0; j < t.length; j++) {
            num[j] = Integer.parseInt(t[j]);

        }

        for (int i = 0; i < K; i++) {

            for (int j = 0; j < t.length-1; j++) {
                num[j] = num[j + 1] - num[j];
            }


        }
        for (int j = 0; j < N-K; j++) {
            if (j < N- K-1) {
                System.out.print(num[j] + ",");
            } else {
                System.out.print(num[j]);
            }
        }
    }
}
