import java.math.BigInteger;
import java.util.Scanner;

public class Noise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.next());
        String multiple = scanner.next();
        BigInteger number2 = new BigInteger(scanner.next());

        if (multiple.equals("*")) {
            System.out.println( number.multiply(number2));
        } else if (multiple.equals("+")) {
            System.out.println(number.add(number2));
        }
    }
}
