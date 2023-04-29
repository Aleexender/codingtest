import java.util.Arrays;
import java.util.Scanner;

public class SmartTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] qwe = new int[4];
        int most = 0;
        int now = 0;

        for (int i = 0; i < 4; i++) {
            int getOut = scanner.nextInt();
            int getIn = scanner.nextInt();
            now -= getOut;
            now += getIn;
            most = java.lang.Math.max(most, now);
        }
        System.out.println(most);
    }
}
