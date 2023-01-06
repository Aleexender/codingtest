import java.util.Scanner;

public class Pibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fun(num));

    }
// 어떤 문제를 풀지 -> base case -> recursive
    static int fun( int num) {
        //base case -> 떠넘기냐 안떠넘기냐, 안떠넘기면 base case(떠넘기지 않아도 정답을 바로 구할수 있는것)
        if (num == 0) {
            return 0;
        }else if (num == 1) {
            return 1;
        }

