import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WizardSharkAndFireStorm {
    static int[] dirRow = {-1, 0, 1, 0};
    static int[] dirCol = {0, 1, 0, -1};
    public static void main(String[] args) {
        /*
        ** L이 여러개 일수도 있음

        Q번 실행하는것
       { 1. 격자로 나눈다 2^L * 2^L
        2. 격자를 시계방향으로 90도 회전
        3. 인접한 칸이 2(포함) 이하면 -1 할것}
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int matrixSize = (int) Math.pow(2, n);

        int[][] arr = new int[matrixSize][matrixSize];

        for(int i =0; i< arr.length; i++){
            for (int k = 0; k < arr.length; k++) {
                arr[i][k] = scanner.nextInt();
            }
        }
        int[] ls = new int[q];

        for (int i = 0; i < q; i++) {
            ls[i] = scanner.nextInt();
        }


        for (int i = 0; i < q; i++) {
            int length = (int) Math.pow(2, ls[i]);
            List<Integer> dividedIndex = divideGrid(length, arr);
            for (int k = 0; k < dividedIndex.size(); k+=2) {
                Integer row = dividedIndex.get(k);
                Integer col = dividedIndex.get(k+1);
                turnClockWise(row, col, length, arr);
            }
            tryMinusOne(arr);
        }
        int sum = getSum(arr);
        var biggestIcePart = Integer.MIN_VALUE;// 가장 큰
        boolean[][] visited = new boolean[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if(!visited[i][k]){
                     biggestIcePart = Math.max(getBiggestIcePart(arr,visited,i,k), biggestIcePart);

                }

            }
        }

        System.out.println(sum);
        System.out.println(biggestIcePart);

    }

    private static int getBiggestIcePart(int[][] arr, boolean[][] visited,int row, int col) { // bfs || dfs
        //base case
        if(arr[row][col] == 0){
            return 0;
        }

        if(visited[row][col]){
            return 0;
        }

        visited[row][col] = true;

        //recursive case
        int sum =1;
        for (int i = 0; i < dirRow.length; i++) {
            var newRow =row + dirRow[i];
            var newCol = col + dirCol[i];

            if (isLengthFine(newRow, newCol, arr) && arr[newRow][newCol] > 0){
                sum += getBiggestIcePart(arr, visited, newRow, newCol);
            }
        }

        return sum;
    }

    private static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                sum += arr[i][k];
            }
        }
        return sum;
    }

    private static void tryMinusOne(int[][] arr) {
        int[][] copy = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                copy[i][k] = arr[i][k];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) { // 4개 탐색하고, 카운트 시킨다음에 count 가 2이하면 -1
                int count = 0;
                if(arr[i][k] == 0){
                    continue;
                }
                for (int dir = 0; dir < dirRow.length; dir++) {
                    var newRow = i + dirRow[dir];
                    var newCol = k + dirCol[dir];

                    if(isLengthFine(newRow, newCol, arr) && arr[newRow][newCol] > 0){
                        count++;
                    }
                }
                if (count < 3) {
                    if (arr[i][k] == 0) {
                        continue;
                    }
                    copy[i][k] -= 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                arr[i][k] = copy[i][k];
            }
        }
    }

    private static boolean isLengthFine(int row,  int col, int[][] arr) {
        return row >= 0 && row < arr.length && col >= 0 && col < arr.length;
    }

    private static void turnClockWise(Integer row, Integer col, int length, int[][] arr) {
        int[][] copy = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                copy[i][j] = arr[row + length - 1 - j][col + i];
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[row + i][col + j] = copy[i][j];
            }
        }
    }

    private static List<Integer> divideGrid(int length, int[][] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i += length) {
            for (int j = 0; j < arr.length; j += length) {
                list.add(i);
                list.add(j);
            }
        }

        return list;
    }
}
