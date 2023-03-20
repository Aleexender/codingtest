import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;

        if (a != b && b != c && a != c) {

            if (a < b && b < c) {
                max = c;
            } else if (a > b && a > c) {
                max = a;
            } else if (a < b && b > c) {
                max = b;
            }
            System.out.println(max * 100);

        } else {
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            } else {
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                } else {
                    System.out.println(1000 + b * 100);
                }
            }
        }
    }
}

