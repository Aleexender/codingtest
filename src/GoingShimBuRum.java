import java.util.Scanner;

public class GoingShimBuRum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int leftSec = 0;
        int changeToSec = 0;


        for (int i = 0; i < 4; i++) {
            input += scanner.nextInt();
        }
        int min = input / 60;
        System.out.println(min);

        changeToSec = min * 60;

        if (input-changeToSec < 60) {
            leftSec = input - changeToSec;
        }
        System.out.println(leftSec);
    }
}
