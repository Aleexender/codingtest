import java.util.Scanner;

public class CalculateScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        int count2 = 0;
        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                count2++;
                sum += count2;
            } else {
                count2 = 0;
            }
        }
        System.out.println(sum);
    }
}
