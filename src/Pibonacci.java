import java.util.Scanner;

public class Pibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(fun(a));
    }

    public static int fun(int a) {
        // base case10
        int sum;

        if (a <= 1) {
            return a;
        } else {
            return fun(a-1) + fun(a-2);
        }

        // recursive case
    }
}
