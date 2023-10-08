import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.next();
        char[] change = words.toCharArray();

        String splitWord = "";
        int count = 0;

        for (int i = 0; i < words.length(); i++) {
            if (count == 10) {
                System.out.println();
                count = 0;
            }
            System.out.print(change[i]);
            count++;

        }
    }
}
