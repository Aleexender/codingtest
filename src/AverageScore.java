import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int FIVE_PEOPLE = 5;
        int sum = 0;

        for (int i = 0; i < FIVE_PEOPLE; i++) {
            int score = scanner.nextInt();
            if (score < 40) {
                score = 40;
            }
            sum += score;
        }

        int result = sum / FIVE_PEOPLE;

        System.out.println(result);
    }
}
