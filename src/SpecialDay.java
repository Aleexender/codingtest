import java.util.Scanner;

public class SpecialDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        if (month > 2) {
            System.out.println("After");
        }

        if (month < 2) {
            System.out.println("Before");
        }

        if (month == 2) {
            if (day == 18) {
                System.out.println("Special");
            }
            if (day > 18) {
                System.out.println("After");
            } else {
                System.out.println("Before");
            }
        }
    }
}
