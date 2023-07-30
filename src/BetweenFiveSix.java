import java.util.Arrays;
import java.util.Scanner;

public class BetweenFiveSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.next();
        String b = scanner.next();
        String changeA = "";
        String changeB = "";
        int[] result = new int[2];

        String maxA = "";
        String maxB = "";
        String minA = "";
        String minB = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '5' || a.charAt(i) == '6') {
                minA += "5";
                maxA += "6";
            } else {
                minA += a.charAt(i);
                maxA += a.charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '5' || b.charAt(i) == '6') {
                minB += "5";
                maxB += "6";
            } else {
                minB += b.charAt(i);
                maxB += b.charAt(i);
            }
        }
        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        System.out.print(min + " " + max);
    }
}
