import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subject = scanner.nextInt();
        double maxScore = 0;
        double logic = 0;
        int[] score = new int[subject];
        double average = 0;

        for (int i = 0; i < subject; i++) { // 최대값을 구하는 반복문
            score[i] = scanner.nextInt();
            maxScore = java.lang.Math.max(score[i], maxScore);
        }
        for (int x = 0; x < subject ; x++) { // 점수를조작 하는 for문
            logic = score[x] / maxScore *100;
            average += logic;
        }
        System.out.println(average / subject);

    }
}
