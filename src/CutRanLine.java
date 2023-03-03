import java.util.Scanner;

public class CutRanLine {
    public static int newRan = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ranQuantity = scanner.nextInt();
        int divideRan = scanner.nextInt();
        int newRan = 0;

        for (int i = 0; i < ranQuantity; i++) {
            newRan = scanner.nextInt();
            fun(ranQuantity,divideRan,newRan);
        }
