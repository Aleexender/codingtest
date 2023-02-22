import java.util.Scanner;

public class CheckInManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            String name = scanner.next();
            System.out.println(name.toLowerCase());
        }
    }
}
