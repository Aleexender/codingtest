import java.util.Scanner;

public class FindSue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String change = scanner.next();
        String[] t = new String[N];
        t = change.split(",");
        int[] num = new int[N];
