import java.util.Scanner;

public class AfterPartyEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = scanner.nextInt();

        int fullSize = n * size;

        for (int i = 0; i < 5; i++) {
            int news = scanner.nextInt();
            int result = news - fullSize;
            System.out.print(result + " ");

        }
    }
}
