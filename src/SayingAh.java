import java.util.Scanner;

public class SayingAh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jInput = scanner.next();
        String docInput = scanner.next();

        if (jInput.length() < docInput.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}
