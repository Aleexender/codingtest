import java.util.Scanner;

public class CountOfAEIOU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] aeiou = {'a', 'e', 'i', 'o', 'u'};

        while (true) {
            String input = scanner.nextLine();


            if (input.equals("#")) {
                break;
            }

            char[] divide = input.toLowerCase().toCharArray();
            int count = 0;

            for (int i = 0; i < aeiou.length; i++) {
                for (int j = 0; j < input.length(); j++) {
                    if (aeiou[i] == divide[j]) {
                        count++;
                    }
                }
            }
