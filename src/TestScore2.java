import java.util.Scanner;

public class TestScore2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SUBJECT = 8;
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < SUBJECT; i++) {
            int score = scanner.nextInt();
            if (i >= 4) {
                result1 += score;
            } else {
                result2 += score;
            }
        }

        if (result1 > result2) {
            System.out.println(result1);
        } else {
            System.out.println(result2);
        }
    }
}
