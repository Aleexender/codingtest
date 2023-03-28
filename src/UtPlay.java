import java.util.Scanner;

public class UtPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] change = input.split(" ");
            int one = 0;
            int zero = 0;

            for (int i = 0; i < 4; i++) {
                if (change[i].equals("1")) {
                    one++;
                } else {
                    zero++;
                }
            }
            if (one == 1 && zero ==3) {
                System.out.println("C");
            } else if (one == 2 && zero ==2) {
                System.out.println("B");
            } else if (one == 3 && zero==1) {
                System.out.println("A");
            } else if (zero == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }

    }
}
