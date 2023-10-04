import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        final int maxMin = 60;
        final int maxHour = 24;
        min += scanner.nextInt();

        while (maxMin <= min) { // 60분을 넘겼을때
            min -= maxMin;
            hour++;
            if (maxHour <= hour ) {
                hour = 0;
            }
        }

        System.out.print(hour + " " + min);
    }
}
