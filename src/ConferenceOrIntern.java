import java.util.Scanner;

public class ConferenceOrIntern {
    public static void main(String[] args) {
        /* 여자 2명 남자 1명
        1. 여자랑 남자중 높은 숫자에서 - 인턴을 뺸다.
        2. 여자는 2씩 뺸다
        3. 남자는 1씩 빠진다
        4. 남자 여자 둘다 되면 카운트 +1 ( 그룹결성 완료)
         */
        Scanner scanner = new Scanner(System.in);
        int girls = scanner.nextInt();
        int mens = scanner.nextInt();
        int intern = scanner.nextInt();
        int group = 0;

