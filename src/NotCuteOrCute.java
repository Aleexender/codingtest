import java.util.Scanner;

public class NotCuteOrCute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int zero = 0;
        int one = 0;

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                zero++;
            } else {
                one++;
            }
        }

        if (zero > one) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
}
