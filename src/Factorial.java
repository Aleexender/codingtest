import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(fun(input));
    }


    static int fun(int input) {
        //base case
        if (input == 0) {
            return 1;
        } else if (input == 1) {
            return 1;
        }


        //recursive case -> 10에서 시작, 9를 알아야 하고 8을 알아야하니...1을 알야하 한다...
        return input * fun(input - 1);
    }
}
