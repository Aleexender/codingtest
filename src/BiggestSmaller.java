import java.util.Arrays;
import java.util.Scanner;

public class BiggestSmaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numQuan = scanner.nextInt();
        int[] nums = new int[numQuan];

        for (int i = 0; i < numQuan; i++) {
            nums[i] = scanner.nextInt();
        }

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        System.out.print(min + " ");
        System.out.print(max);
    }
}
