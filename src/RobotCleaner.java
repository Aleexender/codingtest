import java.util.Scanner;

public class RobotCleaner {
    public static final int[] DIR_ROW = {-1, 0, 1, 0};
    public static final int[] DIR_COL = {0, 1, 0, -1};


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int startRow = scanner.nextInt();
        int startCol = scanner.nextInt();
        int direction = scanner.nextInt();
        int nowRow = startRow;
        int nowCol = startCol;
        int count = 0;

        int[][] arr = new int[row][col];
        boolean[][] cleanArr = new boolean[row][col];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        while (true) {
            if (arr[nowRow][nowCol] == 0) {
                cleanArr[nowRow][nowCol] = true;
            }

            boolean cleaned = isCleaned(nowRow, nowCol, arr, cleanArr);


            if (cleaned) { // 2
                if (isPossibleGoBack(nowRow, nowCol, arr, direction)) { // 2-1
                    nowRow -= DIR_ROW[direction];
                    nowCol -= DIR_COL[direction];

                    continue;
                } else { // 2-2
                    break;
                }
            } else {//3
                direction = turnAntiClock(arr, direction); // 3-1
                if (isPossibleForward(direction, nowRow, arr, nowCol, cleanArr)) { //3-2
                    nowRow += DIR_ROW[direction];
                    nowCol += DIR_COL[direction];
                }
            }
        }

        for (int i = 0; i < cleanArr.length; i++) {
            for (int j = 0; j < cleanArr[0].length; j++) {
                if (cleanArr[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    private static boolean isPossibleForward(int direction, int nowRow, int[][] arr,
                                             int nowCol, boolean[][] cleanArr) {

        int newRow = nowRow + DIR_ROW[direction];
        int newCol = nowCol + DIR_COL[direction];


        return isSafeArea(newRow, newCol, arr) && cleanArr[newRow][newCol] == false && arr[newRow][newCol] != 1;
    }

    private static int turnAntiClock(int[][] arr, int direction) {
        if (direction == 3) {
            return 2;
        } else if (direction == 2) {
            return 1;
        } else if (direction == 1) {
            return 0;
        } else {
            return 3;
        }

    }

    private static boolean isPossibleGoBack(int newRow, int newCol, int[][] arr, int direction) {
        int previousRow = newRow - DIR_ROW[direction];
        int previousCol = newCol - DIR_COL[direction];

        return isSafeArea(previousRow, previousCol, arr) && arr[previousRow][previousCol] != 1;
    }

    private static boolean isCleaned(int startRow, int startCol, int[][] arr, boolean[][] cleanArr) {
        for (int i = 0; i < 4; i++) {
            int newRow = startRow + DIR_ROW[i];
            int newCol = startCol + DIR_COL[i];

            if (isSafeArea(newRow, newCol, arr) && arr[newRow][newCol] == 0 && !cleanArr[newRow][newCol] ) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSafeArea(int newRow, int newCol, int[][] arr) {
        return newRow >= 0 && newCol >= 0 && newRow < arr.length && newCol < arr[0].length;

    }
}
