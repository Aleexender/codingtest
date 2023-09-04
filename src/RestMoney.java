import java.awt.*;
import java.util.Scanner;

public class RestMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giveMoney = scanner.nextInt();

        int restMoney = 1000 - giveMoney;
        int count = 0;

        while (restMoney >= 500) {
            restMoney -= 500;
            count++;
        }
        while (restMoney >= 100) {
            restMoney -= 100;
            count++;
        }
        while (restMoney >= 50) {
            restMoney -= 50;
            count++;
        }
        while (restMoney >= 10) {
            restMoney -= 10;
            count++;
        }
        while (restMoney >= 5) {
            restMoney -= 5;
            count++;
        }
        while (restMoney >= 1) {
            restMoney -= 1;
            count++;
        }


        System.out.println(count);
    }
}
