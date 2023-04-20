import java.util.Scanner;

public class CountAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] split = input.toCharArray();
        int[] alpha = new int[26];

