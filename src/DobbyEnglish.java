import java.util.Scanner;

public class DobbyEnglish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            String alpha = scanner.next();
            String input = scanner.nextLine();
            input = input.toLowerCase();
            alpha = alpha.toLowerCase();
            String[] change = input.split("");
            int count = 0;

            if (alpha.equals("#")) {
                break;
            }
