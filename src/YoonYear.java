import java.util.Scanner;

public class YoonYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        final int yoon =1;
        final int nonYoon =0;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(yoon);
        } else if (year % 400 == 0) {
            System.out.println(yoon);
        } else {
            System.out.println(nonYoon);
        }
    }
}
