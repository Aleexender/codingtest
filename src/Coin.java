import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        int amount = scanner.nextInt();
        int leftAmount = amount;
        int answer = 0;
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < type; i++) {
            int coin = scanner.nextInt();
            if (coin > amount) {
            continue;
            }
            arr.add(coin);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            Integer typeCoin = arr.get(i);
            if (typeCoin > leftAmount) {
                continue;
            }
            answer += amount / typeCoin;
            amount = amount % typeCoin;
        }

        System.out.println(answer);

    }
}
