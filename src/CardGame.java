import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int time = 5;
        int total = 0;

        for (int i = 0; i < time; i++) {
            int input = scanner.nextInt();
            total += input;
        }
        System.out.println(total);
    }

}
