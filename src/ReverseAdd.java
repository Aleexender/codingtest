import java.util.Scanner;

public class ReverseAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();

        StringBuffer stringBuffer = new StringBuffer(x);
        StringBuffer stringBuffer2 = new StringBuffer(y);

        String reverseX = stringBuffer.reverse().toString();
        String reverseY = stringBuffer2.reverse().toString();

        int numX = Integer.parseInt(reverseX);
        int numY = Integer.parseInt(reverseY);

        int result = numX + numY;

        String reverseResult = String.valueOf(result);
        StringBuffer RevResult = new StringBuffer(reverseResult);
        reverseResult = RevResult.reverse().toString();

        result = Integer.parseInt(reverseResult);

        System.out.println(result);
    }
}
