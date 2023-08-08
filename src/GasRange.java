import java.util.Scanner;

public class GasRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int fiveMin = 0;
        int oneMin = 0;
        int tenSec = 0;

        fiveMin = time / 300;
        time %= 300;

        oneMin = time / 60;
        time %= 60;

        tenSec = time / 10;
        time %= 10;

        if (time == 0) {
            System.out.println(fiveMin + " " + oneMin + " " + tenSec);
        } else {
            System.out.println("-1");
        }
    }
}
