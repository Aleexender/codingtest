import java.util.Scanner;

public class ThreeKangaroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = b - a > c - b ? b - a : c - b;
        System.out.println(max - 1);
    }
}
