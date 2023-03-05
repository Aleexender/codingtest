import java.util.Scanner;

public class IntelClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();
        int add = scanner.nextInt();

        min += add / 60;
        sec += add % 60;

        min += sec / 60;
        sec = sec % 60;

        hour += min / 60;
        min = min % 60;

        hour = hour % 24;


        System.out.println(hour +" " + min + " "+ sec);
    }
}
