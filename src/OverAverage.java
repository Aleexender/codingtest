import java.util.Scanner;

public class OverAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int students = scanner.nextInt();
            int score[] = new int[students];
            int average = 0;
            int totalScore = 0;
            double whoOverScore = 0;
            double answer = 0;

            for (int j = 0; j < students; j++) {
                score[j] = scanner.nextInt();
                totalScore += score[j];
            }

            average = (totalScore / students);

            for (int j = 0; j < students; j++) {
                if (score[j] > average) {
                    whoOverScore++;
                }
            }
            answer = (whoOverScore / students) * 100;
            System.out.printf("%.3f%%\n", answer);
        }
    }
}
