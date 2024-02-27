import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col = scanner.nextInt();
        int row = scanner.nextInt();
        int floor = scanner.nextInt();
        int[][][] arrays = new int[floor][row][col];
        Queue<Integer> queue = new LinkedList<>();
        boolean[][][] flags = new boolean[floor][row][col];

        for (int i = 0; i < arrays.length; i++) {
            for (int k = 0; k < arrays[0].length; k++) {
                for (int j = 0; j < arrays[0][0].length; j++) {
                    arrays[i][k][j] = scanner.nextInt();
                    if (arrays[i][k][j] == 1) {
                        queue.offer(i);
                        queue.offer(k);
                        queue.offer(j);
                        queue.offer(0);


                    }
                    if (arrays[i][k][j] == -1) {
                        flags[i][k][j] = true;
                    }
                }
            }
        }
        int day = 0;
        int[] dirRow = {-1, 0, 1, 0,0,0};
        int[] dirCol = {0, 1, 0, -1,0,0};
        int[] dirFloor = {0, 0, 0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int fl = queue.poll();
            int r = queue.poll();
            int c = queue.poll();

            if (flags[fl][r][c]) {
                queue.poll();
                continue;
            }
            day = queue.poll();

            flags[fl][r][c] = true;

            for (int i = 0; i < 6; i++) {
                int newRow = r + dirRow[i];
                int newCol = c + dirCol[i];
                int newFloor = fl + dirFloor[i];

                if (isSafe(arrays, newRow, newCol, newFloor) && arrays[newFloor][newRow][newCol] == 0 && !flags[newFloor][newRow][newCol]) {
                    queue.offer(newFloor);
                    queue.offer(newRow);
                    queue.offer(newCol);
                    queue.offer(day + 1);
                }
            }

        }

        for (int i = 0; i < flags.length; i++) {
            for (int j = 0; j < flags[0].length; j++) {
                for (int k = 0; k < flags[0][0].length; k++) {
                    if (flags[i][j][k] == false) {
                        System.out.println("-1");
                        return;
                    }
                }
            }
        }
        System.out.println(day);
    }

    public static boolean isSafe(int[][][] arrays, int row, int col, int floor) {
        return row < arrays[0].length &&
                row >= 0 &&
                col < arrays[0][0].length &&
                col >= 0 &&
                floor < arrays.length &&
                floor >= 0;
    }

}
