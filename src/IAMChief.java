import java.util.Scanner;

public class IAMChief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0;
        int num = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4; j++) {
                int score = scanner.nextInt();
                arr[i] += score;
            }
        }
