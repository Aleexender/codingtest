import java.util.Scanner;

public class RTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int average = scanner.nextInt();

        int r2 = average * 2 - r1;
        System.out.println(r2);

    }
}
