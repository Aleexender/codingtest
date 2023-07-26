import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();
            int[] dollar = new int[number];

            if (number == 0) {
                break;
            }

            for (int i = 0; i < number; i++) {
                dollar[i] = scanner.nextInt();
            }

            for (int i = 0; i < number - 1; i++) {
                if (dollar[i] == dollar[i + 1]) {
                    dollar[i] = 0;
                }
            }

            for (int i = 0; i < dollar.length; i++) {
                if (dollar[i] == 0) {

                } else {
                    System.out.print(dollar[i] + " ");
                }

                if (i == dollar.length -1) {
                    System.out.print("$");
                    System.out.println();
                }

            }
        }
    }
}
