import java.util.Scanner;

public class CalculateTranscript {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("A+")) {
            System.out.println("4.3");
        } else if (input.equals("A0")) {
            System.out.println("4.0");
        } else if (input.equals("A-")) {
            System.out.println("3.7");
        } else if (input.equals("B+")) {
            System.out.println("3.3");
        }
    }
}
