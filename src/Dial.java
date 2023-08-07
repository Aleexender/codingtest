import java.util.HashMap;
import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alpha = scanner.next();
        char[] split = alpha.toCharArray();
        int sum = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i] == 'A' || split[i] == 'B' || split[i] == 'C') {
                sum += 3;
            } else if (split[i] == 'D' || split[i] == 'E' || split[i] == 'F') {
                sum += 4;
            } else if (split[i] == 'G' || split[i] == 'H' || split[i] == 'I') {
                sum += 5;
            } else if (split[i] == 'J' || split[i] == 'K' || split[i] == 'L') {
                sum += 6;
            } else if (split[i] == 'M' || split[i] == 'N' || split[i] == 'O') {
                sum += 7;

            } else if (split[i] == 'P' || split[i] == 'Q' || split[i] == 'R' || split[i] == 'S') {
                sum += 8;
            } else if (split[i] == 'T' || split[i] == 'U' || split[i] == 'V') {
                sum += 9;
            } else if (split[i] == 'W' || split[i] == 'X' || split[i] == 'Y' || split[i] == 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
