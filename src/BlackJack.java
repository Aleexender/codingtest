import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        /*
        1. 카드 숫자와 목표숫자를 입력하게함
        2. 모든 숫자를 앞에 3개씩 뽑아서 합친다.
        3. 모든 합과 목표숫자를 하나하나씩 비교한다.
        4. 가장 가까운수를 프린트 한다.
         */
        Scanner scanner = new Scanner(System.in);
        int amountCard = scanner.nextInt();
        int objectNumber = scanner.nextInt();
        int max = 0;
        int results = 0;
        int[] numbers = new int[amountCard];

        for (int i = 0; i < amountCard; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < amountCard; i++) {
            for (int j = i+1; j < amountCard; j++) {
                for (int k = j+1; k < amountCard; k++) {
                    results = numbers[i] + numbers[j] + numbers[k]; // 3중 for문 사용해야지 전체를 돔

                    if (max < results) {
                        if (results <= objectNumber) {
                            max = results;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
