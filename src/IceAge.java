import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class IceAge {
    static int[] DIR_ROW = {-1, 0, +1, 0};
    static int[] DIR_COL = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        boolean[][] isIce = new boolean[n][m];
        int[][] arr = new int[n][m];
        Queue<Integer> numQ = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            String[] s1 = bufferedReader.readLine().split(" ");
            for (int k = 0; k < arr[0].length; k++) {
                arr[i][k] = Integer.parseInt(s1[k]);
                if (arr[i][k] != 0) {
                    isIce[i][k] = true;
                    numQ.add(i);
                    numQ.add(k);
                }
            }
        }

        int year = 0;

        while (!numQ.isEmpty()) {
            deleteIce(arr, numQ);
            year++;

            if (isIceSeperated(arr, numQ)) {
                System.out.println(year);
                return;
            }


        }
        System.out.println(0);

    }

    private static void deleteIce(int[][] arr, Queue<Integer> numQ) {
        // use the for loop to find the number which is not 0; and then find the adjust zero node and delete counted node;
        boolean[][] isIced = new boolean[arr.length][arr[0].length];

        int size = numQ.size() / 2;
        for (int i = 0; i < size; i++) {
            Integer row = numQ.poll();
            Integer col = numQ.poll();
            isIced[row][col] = true;
            int count = 0;

            for (int z = 0; z < 4; z++) {
                int newRow = DIR_ROW[z] + row;
                int newCol = DIR_COL[z] + col;


                if (isLengthFine(arr, newRow, newCol) && !isIced[newRow][newCol] &&
                    arr[newRow][newCol] == 0) {
                    count++;
                }
            }
            arr[row][col] -= count;
            arr[row][col] = java.lang.Math.max(arr[row][col], 0);
            if (arr[row][col] != 0) {
                numQ.add(row);
                numQ.add(col);
            }


        }
    }

    private static boolean isLengthFine(int[][] arr, int newRow, int newCol) {
        return newRow >= 0 && newRow < arr.length && newCol >= 0 && newCol < arr[0].length;
    }

    private static boolean isIceSeperated(int[][] arr, Queue<Integer> numQ) {
        // find the non-zero node and then start the DFS
        // use the DFS to make a group of the ic
        // and then if the sepreated ice is over two -> true || false;

        boolean[][] isVisited = new boolean[arr.length][arr[0].length];
        int iceCount = 0;


        int size = numQ.size() / 2;
        for (int i = 0; i < size; i++) {
            Integer row = numQ.poll();
            Integer col = numQ.poll();

            if (arr[row][col] != 0 && !isVisited[row][col]) {
                startFun(arr, isVisited, row, col);
                iceCount++;
                if (iceCount >= 2) {
                    return true;
                }
            }

            numQ.add(row);
            numQ.add(col);
        }


        return false;
    }

    private static void startFun(int[][] arr, boolean[][] isVisited, int row, int col) {
        //base case
        if (arr[row][col] == 0) {
            return;
        }

        isVisited[row][col] = true;

        //recursive case
        for (int i = 0; i < 4; i++) {
            int newRow = row + DIR_ROW[i];
            int newCol = col + DIR_COL[i];

            if (isLengthFine(arr, newRow, newCol) && !isVisited[newRow][newCol]) {
                startFun(arr, isVisited, newRow, newCol);
            }
        }
    }


}
