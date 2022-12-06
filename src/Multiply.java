import java.util.Scanner;

public class Multiply {

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        final int maximum = 9;

        for (int i = 1; i <= maximum; i++) {
            int answer = num * i;
            System.out.println(num + " * " + i + " = "+ answer);
        }


    }
}
