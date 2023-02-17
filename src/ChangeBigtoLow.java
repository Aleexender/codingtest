import java.util.Scanner;

public class ChangeBigtoLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] changeEach = input.toCharArray();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (changeEach[i] == Character.toLowerCase(changeEach[i])) {
                answer.append(Character.toUpperCase(changeEach[i]));
            } else {
               answer.append(Character.toLowerCase(changeEach[i]));
            }
        }
        System.out.println(answer);
    }
}
