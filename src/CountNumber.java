import java.util.Arrays;
import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        int result = 0;

        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }

        int correctNum = scanner.nextInt();

