import java.util.Arrays;
import java.util.Scanner;

public class TheMostBigGemMinSu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // N 부터 만족하는 수까지 감소하면서 찾는다.
        for (int i = N; i >= 4; i--) {
            boolean flag = true;
            int num = i;
            while (num != 0) {
                // num의 끝에 자리가 4이거나 7일경우 => 다음 자리수를 찾기 위해 10으로 나눔
                if (num % 10 == 4 || num % 10 == 7)
                    num /= 10;
                    // num이 4나 7로 나누어 떨어지지 않는경우 => 조건 만족 X, 다음수 찾기 위해 while문 탈출
                else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
                break;
            }
        }
        scan.close();
    }
}