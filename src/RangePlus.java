import java.util.Arrays;
import java.util.Scanner;

public class RangePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int vertical = scanner.nextInt();

        int[][] arrArr = new int[row][vertical];

        for (int i = 0; i < 2; i++) { //2번 반복 된다
            for (int z = 0; z < row; z++) { //
                for (int j = 0; j < vertical; j++) { //0,1 0,2 0,3  || 1,1 1,2 1,3  || 2,1 2,2 2,3
                    arrArr[z][j] += scanner.nextInt();
                }
            }
        }
        // 프린트 해주는 메소드
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < vertical; j++) {
                System.out.print(arrArr[i][j] +" " );
            }
            System.out.println();
        }
