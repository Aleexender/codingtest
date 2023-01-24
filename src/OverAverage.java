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

