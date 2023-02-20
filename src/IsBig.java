import java.util.Scanner;

public class IsBig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {


            int left = scanner.nextInt();
            int right = scanner.nextInt();

            if (left == 0 && right == 0) {
                break;
            }

            String qwe = left > right ? "Yes" : "No";
            System.out.println(qwe);
        }
    }
}
