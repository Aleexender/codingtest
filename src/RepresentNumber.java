import java.util.Scanner;

public class RepresentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int total = 0;
        int[] countNumber = new int[1001];
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            numbers[i] = a;
            total += numbers[i];
            countNumber[a]++;
        }

        for (int i = 0; i < countNumber.length; i++) {
            if (max < countNumber[i]) {
                max = countNumber[i];
                maxIndex = i;
            }
        }
        int average = total / 10;

        System.out.println(average);
        System.out.println(maxIndex);
    }
}
