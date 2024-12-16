import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        for (int i = 0; i < count; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int total = A+B;
            System.out.println(total);
        }

    }
}
