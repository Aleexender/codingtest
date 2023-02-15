import java.util.Scanner;

public class WinterOhWinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] splitWord = input.split("");

            if (input.equals("***")) {
                break;
            }

            for (int i = splitWord.length-1; i >= 0; i--) {
                String output = splitWord[i];
                System.out.print(output);

            }
            System.out.println();
        }
    }
}
