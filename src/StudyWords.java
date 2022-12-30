import java.util.Scanner;

public class StudyWords {

    public void study() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase(); // 해당 스트링을 소문자로 바꿔줌
        String alpha = "abcdefghijklmnopqrstuvwxyz"; // 스트링으로 알파벳 생성
        char[] eachAlpha = alpha.toCharArray();
        int[] counts = new int[26]; // 26개의 알파벳에 값을 넣어주기 위해서
        int valueOfIndex = 0;
        valueOfIndex = 'a'+ 0;


        for (int i = 0; i < input.length(); i++) { // 입력받은 값을 하나씩 꺼낸다

            char now = input.charAt(i);
            int index = now - 'a'; // a == 65 , F = int값을 구하는것
            counts[index]++; // value 숫자가 몇번 반복됬는지 체크해줌
        }
        int biggestNum = counts[0];


        for (int x = 1; x < counts.length; x++) { // 큰수 찾기. 1부터 시작하는 이유는 biggestNum이 0번째 인덱스 부터 시작하기 때문에
            if (biggestNum < counts[x]) {// 인덱스 0과 1 비교
                biggestNum = counts[x];
                valueOfIndex = x + 'a'; // 가장 큰 값의 인덱스 a = 알파벳을 a로 기준을 잡고 거기서 +를 하기위해서, 알파벳을 찾기위함
            }
        }
        int countIndex = valueOfIndex - 'a'; // 인덱스 벨류의 값이 얼마인지 ex) a 반복횟수 == 3 의, 가장 큰 값임


        for (int k = 0; k < counts.length; k++) {
            if (countIndex == k) {// 가장 큰숫자가 countIndex 의 인덱스와 같을수 있기때문에 한번은 지나쳐야함
                continue;
            }

            if (biggestNum == counts[k]) {
                System.out.println("?");
                return;
            }
        }

        Character changeAlpha = (char) valueOfIndex; // int를 char 로 바꿔주는 방법
        char makeBigger =Character.toUpperCase(changeAlpha);

        System.out.println(makeBigger);

    }
}