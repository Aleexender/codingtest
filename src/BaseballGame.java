import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players = scanner.nextInt();
        int[] num = new int[28];
        boolean[] valid = new boolean[28];
        boolean onlyOne = false;
            /*
            1. 앞에 글자 [0]만 꺼내와서 그걸 아스키코드로 char -> int로 변환해야함
            2. a 면 [0] b면 [1] 에 카운트 ++
            3. count 5가 넘어가면 출력
             */
        for (int i = 0; i < players; i++) { // 해당 array에 카운트를 넣어주는 로직
           String name = scanner.next();
            char[] splitName = name.toCharArray(); // 알파벳으로 나눈 상태

            int n = splitName[0];
            num[n - 'a'] += 1;
        }

        for (int i = 0; i < num.length; i++) { // 5를 넘는지 검사하는 로직
            if (num[i] >= 5) {
                char answer = (char) (i + 'a');
                System.out.print(answer);
            }
            if (num[i] >= 5) { // 전체를 검사하고 5를 넘는게 있다면 true를 넘겨주는 로직
                onlyOne = true;
            }
        }
        if (!onlyOne) {
            System.out.println("PREDAJA");
        }
    }
}