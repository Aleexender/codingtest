import java.util.Arrays;
import java.util.Scanner;

public class LessThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberQuan = scanner.nextInt();
        int numLimit = scanner.nextInt();
        int[] nums = new int[numberQuan];

        for (int i = 0; i < numberQuan; i++) {
            nums[i] = scanner.nextInt();
        }
