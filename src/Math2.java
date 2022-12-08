import java.util.Scanner;


public class Math2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int total = A+B;

            System.out.println(total);

        }

    }

    public static class AxB {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int total = A * B;

            System.out.println(total);
        }
    }
}

