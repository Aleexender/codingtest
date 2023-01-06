import java.util.Scanner;

public class Pibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fun(num));

    }
// 어떤 문제를 풀지 -> base case -> recursive
    static int fun( int num) {
