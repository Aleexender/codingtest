import java.util.Scanner;


public class Math3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int total = A+B;
            if (A + B == 0) {
                continue;
            } else {
                System.out.println(total);
            }
        }
    }
}

