import java.util.Scanner;

public class ReadHorizontally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LINE = 5;
        char[][] divide = new char[LINE][15];
        // 안전한 방법은 무지성으로 2중 for문을 만들어서 하나한씩 주입
        for (int i = 0; i < LINE ; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                divide[i][j] = input.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < LINE; i++) {
                if (divide[i][j] != 0) {
                    System.out.print(divide[i][j]);
                }
            }

        }



    }
}
