import java.util.Arrays;
import java.util.Scanner;

public class FindAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] alpha = new int[26];

        for (int k = 0; k < alpha.length; k++) {
            alpha[k] = -1;
        }

        String word = scanner.nextLine();
