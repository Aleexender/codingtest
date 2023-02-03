import java.math.BigInteger;
import java.util.Scanner;

public class BestRich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();

        System.out.println(n.divide(m)); // 나누기
        System.out.println(n.remainder(m)); // 나머지
    }
}
