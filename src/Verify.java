import java.util.Scanner;

public class Verify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int serialnum = 5;
        int[] num = new int[serialnum];
        int sum = 0;

        for (int i = 0; i < serialnum; i++) {
            num[i] = scanner.nextInt();
            sum += num[i] * num[i];
        }
        int result = sum % 10;
        System.out.println(result);


    }
}
