import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();


        for (int i = 0; i < repeat; i++) {
            String input = scanner.next();
            int length = input.length(); // 복습
            String qwe = String.valueOf(input.charAt(0));
            String qwer = String.valueOf(input.charAt(length - 1));

            System.out.println(qwe + qwer);

        }
    }
}
