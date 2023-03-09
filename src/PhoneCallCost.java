import java.util.Scanner;

public class PhoneCallCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int minPayment = 0;
        int yongPayment = 0;
        for (int i = 0; i < time; i++) {
            int phoneSec = scanner.nextInt();

