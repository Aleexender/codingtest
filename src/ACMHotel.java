import java.util.Scanner;

public class ACMHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();

        for (int i = 0; i < time; i++) {
            int row = scanner.nextInt();
            int colum = scanner.nextInt();
            int people = scanner.nextInt() -1;
            int hotelFloor = 0;
            final int ROOM_NUMBER = 100;
            int result = 0;
            hotelFloor = people % row; // 4
            int ho = people / row;
            result = (hotelFloor+1) * ROOM_NUMBER + ho + 1;
            System.out.println(result);
        }

    }
}
