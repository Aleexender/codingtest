import java.util.Scanner;

public class PrimeNumberFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        int count = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag = true;
                }
            }
            if (!flag && arr[i] != 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
