import java.util.Scanner;

public class WhiteBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < 8; j++) {
                if (s.charAt(j) == 'F' && (i + j) % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
