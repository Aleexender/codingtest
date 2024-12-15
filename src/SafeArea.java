import java.util.Scanner;

public class SafeArea {
    static int[] DIR_ROW = {-1, 0, 1, 0};
    static int[] DIR_COL = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] arr = new int[size][size];

        int maxLevel = Integer.MIN_VALUE;
        int minLevel = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int val = scanner.nextInt();
                arr[i][j] = val;
                maxLevel = Math.max(maxLevel, val);
                minLevel = Math.min(minLevel, val);
            }
        }
        int maxCount = Integer.MIN_VALUE;
        for (int currentLevel = minLevel-1; currentLevel <= maxLevel; currentLevel++) {
            boolean[][] visited = new boolean[size][size];
            int count = 0;
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr.length; col++) {
                    if(arr[row][col] > currentLevel && !visited[row][col]) {
                        count +=  fun(arr, currentLevel, visited, row, col);
                    }
                }
            }
            maxCount = Math.max(count, maxCount);
        }
        if(maxCount == Integer.MIN_VALUE) {
            System.out.println(1);
            return;
        }

        System.out.println(maxCount);
    }

    public static int fun(int[][] arr, int level, boolean[][] visited, int row, int col) {
        //base case
        if(arr[row][col] <= level || visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;

        //recursive case
        for(int i =0; i< DIR_ROW.length;i++) {
            int newRow = row + DIR_ROW[i];
            int newCol = col + DIR_COL[i];

            if (isLengthFine(newRow, newCol, arr) && arr[newRow][newCol] > level && !visited[newRow][newCol]) {

                fun(arr, level, visited, newRow, newCol);
            }
        }
        return 1;
    }

    private static boolean isLengthFine(int newRow, int newCol, int[][] arr) {
        return newRow >= 0 && newRow < arr.length && newCol >= 0 && newCol < arr.length;
    }
}
