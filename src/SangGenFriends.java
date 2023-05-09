import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class SangGenFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int[] sum = new int[2];

            for (int j = 0; j < sum.length; j++) {
                sum[j] = scanner.nextInt();
            }

            if (sum[0] == 0 && sum[1] == 0) {
                break;
            }
            int result = Arrays.stream(sum).sum();

            System.out.println(result);
        }
    }
}
