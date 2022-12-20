import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        final int getUpEarly = 45;

        int clock = min - 45;
        if (min < getUpEarly) {
            hour -= 1;
            min += 60;

            if (hour < 0) {
                hour += 24;
            }
        }
