import java.util.Scanner;

public class SmallerThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int standard = scanner.nextInt();
        int[] num = new int[count];


        for (int i = 0; i < count; i++) {
            num[i] = scanner.nextInt();
            if (num[i] < standard) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
