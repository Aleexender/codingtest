import java.util.Scanner;

public class ConstantPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int[] arr = new int[8];
            int[] count = new int[8];
            boolean noRepeat = true;
            String[] a = scanner.next().split("");
            int max = 0;

