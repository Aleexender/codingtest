import java.util.Scanner;

public class PhoneCallCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int minPayment = 0;
        int yongPayment = 0;
        for (int i = 0; i < time; i++) {
            int phoneSec = scanner.nextInt();

            minPayment += ((phoneSec / 60) + 1) * 15;
            yongPayment += ((phoneSec / 30) + 1) * 10;
        }
        if (yongPayment == minPayment) {
            System.out.println("Y M " + yongPayment);
        } else if (yongPayment < minPayment) {
            System.out.println("Y " + yongPayment);
        } else {
            System.out.println("M " + minPayment);
        }
    }
}
