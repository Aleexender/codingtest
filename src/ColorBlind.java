import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColorBlind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        char[][] arr = new char[length][length];
        boolean[][] isVisited = new boolean[length][length];
        int count = 0;
        int colorBlindCount = 0;


        for (int i = 0; i < arr.length; i++) { // 일반인 전용
            String nextLine = scanner.next();
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = nextLine.charAt(j);
            }
        }
        int[] dirRow = {-1, 0, 1, 0};
        int[] dirCol = {0, 1, 0, -1};

        for (int i = 0; i < length; i++) { // 색맹 전용
            for (int k = 0; k < length; k++) {
                if (!isVisited[i][k]) {
                    bfsForNotBlind(arr, isVisited, dirRow, dirCol, i,k );
                    count++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 'G') {
                    arr[i][j] = 'R';
                }
            }
        }

        isVisited = new boolean[length][length];

        for (int i = 0; i <length; i++) {
            for (int k = 0; k < length; k++) {
                if (!isVisited[i][k]) {
                    bfsForNotBlind(arr, isVisited, dirRow, dirCol, i,k );
                    colorBlindCount++;
                }
            }
        }




        System.out.println(count + " " + colorBlindCount);
    }

    private static void bfsForNotBlind(char[][] arr, boolean[][] isVisited, int[] dirRow, int[] dirCol, int row, int col) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(row);
        queue.add(col);

        while (!queue.isEmpty()) {
            Integer presentRow = queue.poll();
            Integer presentCol = queue.poll();

            if (isVisited[presentRow][presentCol]) {
                continue;
            }

            isVisited[presentRow][presentCol] = true;

            char color = arr[presentRow][presentCol];

            for (int i = 0; i < dirCol.length; i++) {
                int newRow = dirRow[i] + presentRow;
                int newCol = dirCol[i] + presentCol;
                if (isLengthFine(arr, newRow, newCol) && isNormalPerson(color,arr[newRow][newCol]) && !isVisited[newRow][newCol] ) { // 색맹 아님
                    queue.add(newRow);
                    queue.add(newCol);
                }
            }
        }
    }

    private static boolean isNormalPerson(char color, char newColor) {
        return newColor == color;
    }

    public static boolean isLengthFine(char[][] arr, int row, int col) {
        return 0 <= row && 0 <= col && arr.length > row && arr.length > col;
    }
}
