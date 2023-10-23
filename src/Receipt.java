import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMoney = scanner.nextInt();
        int total = scanner.nextInt();

        for (int i = 0; i < 8; i++) {
            total += scanner.nextInt();
        }

        System.out.println(totalMoney - total);




    }
}
