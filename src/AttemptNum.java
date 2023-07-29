import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AttemptNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char[][] twoArray = new char[size][size];
        boolean[][] valid = new boolean[twoArray.length][twoArray.length];
        List<Integer> aptAmount = new ArrayList<>();


        for (int i = 0; i < size; i++) {
            String input = scanner.next();
            for (int j = 0; j < size; j++) {
                twoArray[i][j] = input.charAt(j);
            }
        }



        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (twoArray[i][j] == '1' && !valid[i][j]) {
                    fun(i, j, twoArray, valid);
                    aptAmount.add(apt);
                    apt = 0;
                }
            }
        }
        System.out.println(aptAmount.size());

        Collections.sort(aptAmount); // 정렬만 하는구간

        for (int apt : aptAmount) {
            System.out.println(apt);
        }
    }

    public static int[] dirRow = {-1, 0, 1, 0};
    public static int[] dirCol = {0, 1, 0, -1};
    public static int apt = 0;

    /*
          1. 나누어 져있는 블록으 새야한다.
          2. 각 1X1 로 보았을때 연결되어있으면 카운트++
          3. 단지를 출력 + 각 단지의 수를 카운트
           */
    public static void fun(int row, int colum, char[][] twoArr, boolean[][] validate) { //DFS
        // base case
        validate[row][colum] = true;
//        if (twoArr[row][colum] == 0) {
//            return;
//        }
//        if (validate[row][colum]) {
//            System.out.print(row);
//            System.out.print(colum);
//            System.out.println();
//        }
        apt++;

        //recursive case
        for (int i = 0; i < 4; i++) {
            int newRow = row + dirRow[i];
            int newCol = colum + dirCol[i];

            if ( isValid(twoArr, newRow, newCol) &&!validate[newRow][newCol] && twoArr[newRow][newCol] == '1') {
                fun(newRow, newCol, twoArr, validate);
            }
        }

    }

    public static boolean isValid(char[][] twoArr, int newRow,int newCol) {
        return newRow >= 0 && newRow < twoArr.length &&
                newCol >= 0 && newCol < twoArr[newRow].length;
    }
}
