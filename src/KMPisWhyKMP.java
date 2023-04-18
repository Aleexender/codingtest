import java.util.Scanner;

public class KMPisWhyKMP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] divide =word.split("-");

        for (int i = 0; i < divide.length; i++) {
            System.out.print(divide[i].charAt(0));
        }
    }
}
