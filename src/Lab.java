import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int max = Integer.MIN_VALUE;

        List<Integer> virus = new ArrayList<>();

        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int i1 = scanner.nextInt();
                if (i1 == 2) {
                    virus.add(i);
                    virus.add(j);
                }
                arr[i][j] = i1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[0].length; u++) { // 벽새우기
                if (isNotZero(arr, i, u)) {
                    continue;
                }
                arr[i][u] = 1;


                for (int k = 0; k < arr.length; k++) {
                    for (int j = 0; j < arr[0].length; j++) {
                        if (isNotZero(arr, k, j)) {
                            continue;
                        }
                        arr[k][j] = 1;

                        for (int l = 0; l < arr.length; l++) {
                            for (int o = 0; o < arr[0].length; o++) {
                                boolean[][] visited = new boolean[m][n];
                                if (isNotZero(arr, l, o)) {
                                    continue;
                                }
                                arr[l][o] = 1;


                                for (int z = 0; z < virus.size(); z += 2) {
                                    Integer row = virus.get(z);// row
                                    Integer col = virus.get(z + 1);// col
                                    fun(arr, row, col, visited);


                                }
                                int safePlace = findSafePlace(arr, visited);
                                max = java.lang.Math.max(safePlace, max);

                                arr[l][o] = 0;
                            }
                        }
                        arr[k][j] = 0;
                    }
                }
                arr[i][u] = 0;
            }
        }

        System.out.println(max);
    }

    private static boolean isNotZero(int[][] arr, int i, int u) {
        if (arr[i][u] != 0) {
            return true;
        }
        return false;
    }

    static final int[] DIR_ROW = {-1, 0, 1, 0};
    static final int[] DIR_COL = {0, 1, 0, -1};

    private static void fun(int[][] arr, int row, int col, boolean[][] visited) {
        // base case
        if (arr[row][col] == 1) {
            return;
        }

        if (visited[row][col]) {
            return;
        }

        visited[row][col] = true;


        //recursive case
        for (int i = 0; i < 4; i++) {
            int newRow = row + DIR_ROW[i];
            int newCol = col + DIR_COL[i];
            if (isSafe(arr, newRow, newCol) && !visited[newRow][newCol]) {
                fun(arr, newRow, newCol, visited);
            }
        }

    }

    private static boolean isSafe(int[][] arr, int newRow, int newCol) {
        return 0 <= newRow && 0 <= newCol && arr.length > newRow && arr[0].length > newCol;
    }


    private static int findSafePlace(int[][] arr, boolean[][] visited) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                if (arr[i][k] == 0 && !visited[i][k]) {
                    count++;
                }
            }
        }
        return count;
    }

}

