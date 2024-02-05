import java.util.Scanner;

public class AlphaBet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        char[][] arr = new char[row][col];
        boolean[] savedAlpha = new boolean[26]; // 인덱스로 true = 중복인것
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < arr.length; i++) {
            String word = scanner.next();
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = word.charAt(k);
            }
        }

        System.out.println(fun(arr, visited, savedAlpha, 0, 0));


    }

    public static int[] dirRow = {-1, 0, 1, 0};
    public static int[] dirCol = {0, 1, 0, -1};

    public static int fun(char[][] arr, boolean[][] visited, boolean[] savedAlpha, int row, int col) { // 최대 값을 샌다 -> 새오라고 시키는것
        // base 3개 - index 검사, saveAlpha -등장한 알파인지 아닌지, visited
        int childCount =0;
        int maxCount = Integer.MIN_VALUE;

        if (isOverLength(row, col, arr)) {
            return 0;
        }
        if (visited[row][col]) {
            return 0;
        }
        char alpha = arr[row][col];
        if (savedAlpha[alpha - 'A']) {
            return 0;
        }

        visited[row][col] = true;
        savedAlpha[alpha - 'A'] = true;


        // recursive -> 순수하게 넘겨만 주면 끝
        for (int i = 0; i < dirRow.length; i++) {
            int newRow = dirRow[i] + row;
            int newCol = dirCol[i] + col;

            childCount = fun(arr, visited, savedAlpha, newRow, newCol);
            maxCount = java.lang.Math.max(maxCount, childCount);
        }
        visited[row][col] = false;
        savedAlpha[alpha - 'A'] = false;

        return maxCount + 1;


    }

    private static boolean isOverLength(int row, int col, char[][] arr) {
        return 0 > row || 0 > col || row >= arr.length || col >= arr[row].length;
    }
}
