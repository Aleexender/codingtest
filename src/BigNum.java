import java.math.BigInteger;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger input = scanner.nextBigInteger();
        BigInteger input2 = scanner.nextBigInteger();
        System.out.println(input2.add(input));

    }
}
