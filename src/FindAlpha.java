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

        for (int i = 0; i < word.length(); i++) {
            char split = word.charAt(i);
            int index = split - 'a'; // 알파벳 26개를 어디에 있는지 매핑해줌

            if (alpha[index] == -1) {
                alpha[index] = i;
            }

