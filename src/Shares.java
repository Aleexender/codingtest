import java.util.Scanner;

public class Shares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CHIEF = 1;
        while (scanner.hasNext()) {

            int n = scanner.nextInt() + CHIEF;
            int s = scanner.nextInt();

            System.out.println(s / n);
        }
    }
}
