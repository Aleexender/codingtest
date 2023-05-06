import java.util.Scanner;

public class HotFishCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int colum = scanner.nextInt();


        for (int i = 0; i < row; i++) {
            String a = scanner.next();
            StringBuffer change = new StringBuffer(a);
            StringBuffer reverse = change.reverse();

            System.out.println(reverse);
        }
    }
}
