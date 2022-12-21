import java.util.Scanner;

public class RepeatLan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int j = 0; j < count; j++) {
            int time = scanner.nextInt();
            String language = scanner.next();


            for (int i = 0; i < language.length(); i++) {
                for (int n = 0; n < time; n++) {
                    System.out.print(language.charAt(i));
                }
            }
