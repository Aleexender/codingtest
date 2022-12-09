import java.util.Scanner;

public class MathMetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int add = A+B;
        int minus = A-B;
        int multiply = A * B;
        int divide = A/B;
        int rest = A%B;

        for (int i = 0; i < 1; i++) {
            System.out.println(add);
            System.out.println(minus);
            System.out.println(multiply);
            System.out.println(divide);
            System.out.println(rest);
        }
    }
}
