import java.util.Scanner;

public class MakingEnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String otherInput = scanner.next();
        String[] split = input.split("");
        String[] otherSplit = otherInput.split("");
        int answer = 0;
