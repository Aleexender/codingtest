import java.util.Scanner;

public class TheBiggest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrnum = new int[9];
        final int repeatNum = 9;
        int max = 0;
        int index = 0;

        for (int i = 0; i < repeatNum; i++) { // 어레이에 대입해주는 for문
            int input = scanner.nextInt(); // 값 입력
            arrnum[i] = input;// 입력한 값을 i번째 인덱스 arrnum 에 대입
            if (arrnum[i] > max) {
                max = arrnum[i]; //arrnum의 값은 max로 넘어감
                index = i+1; // index 값을 비교하는게 아니라 몇번째 인지 확인하는거기 때문에 +1
            }
        }
