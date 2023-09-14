import java.util.Arrays;
import java.util.Scanner;

public class MissPhoneCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int song = scanner.nextInt();
        int songTime = scanner.nextInt();
        int bellRinging = scanner.nextInt();
        boolean[] restTime = new boolean[20 * 181];
        Arrays.fill(restTime, true);
        final int REST = 5;
        int songStart = 0;

        int j = 0;
        for (int i = 0; i < song; i++) {
            for (j = songStart; j < restTime.length && j < songStart + songTime; j++) {
                restTime[j] = false;
            }
            songStart += REST + songTime;
        }

        int answer = bellRinging;
        while (true) {
            if (restTime[answer]) {
                System.out.println(answer);
                break;
            } else {
                answer += bellRinging;
            }
        }
    }

}
