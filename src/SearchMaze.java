

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchMaze {
    /**
     * 1. int[] -> Node class
     * 2. if 방향 검사 -> for loop
     */

    // 위, 오른쪽, 아래, 왼쪽
    static int[] dirRow = {-1, 0, 1, 0};
    static int[] dirCol = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] arrs = new int[n][m];

//        char[] chars = input.toCharArray();
        int row = scanner.nextInt();
        int colum = scanner.nextInt();

        char[][] maze = new char[row][colum];
        boolean[][] visit = new boolean[row][colum];
//
//        String input = "101111";
        String input2 = "101010";
        String input3 = "101011";
        String input4 = "111011";

//        maze[0][0] = input.charAt(0);
//        maze[0][1] = input.charAt(1);
//        maze[0][2] = input.charAt(2);
//        maze[0][3] = input.charAt(3);
//        maze[0][4] = input.charAt(4);
//        maze[0][5] = input.charAt(5);

//        for (int i = 0; i < maze[0].length; i++) {
//            maze[0][i] = input.charAt(i);
//        }
//        for (int i = 0; i < maze[0].length; i++) {
//            maze[1][i] = input.charAt(i);
//        }
//        for (int i = 0; i < maze[0].length; i++) {
//            maze[2][i] = input.charAt(i);
//        }
//        for (int i = 0; i < maze[0].length; i++) {
//            maze[3][i] = input.charAt(i);
//        }

        for (int i = 0; i < maze.length; i++) {
            String input = scanner.next();
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = input.charAt(j);
            }
        }

        int[] start = {0, 0, 0};
        fun(start, visit, maze);
    }

    public static void fun(int[] start, boolean[][] visited, char[][] maze) { //BFS
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(start[0], start[1], start[2]));

        while (!q.isEmpty()) {
            Node nowNode = q.poll();
            int presentRow = nowNode.row; // row
            int presentCol = nowNode.col; // col

            if (visited[presentRow][presentCol]) {
                continue;
            }
            visited[presentRow][presentCol] = true;

            for (int dir = 0; dir < 4; dir++) {
                int newRow = nowNode.row + dirRow[dir];
                int newCol = nowNode.col + dirCol[dir];

                if (isValid(maze, newRow, newCol) && !visited[newRow][newCol] && maze[newRow][newCol]== '1') {
                    q.offer(new Node(newRow, newCol, nowNode.count + 1));
                }
            }

//            if (presentRow - 1 >= 0 && maze[presentRow - 1][prsentColum] == '1') { // 위쪽
//                q.offer(new Node(presentRow - 1, prsentColum, nowNode.count + 1);
//            }
//            if (prsentColum + 1 < maze[presentRow].length && maze[presentRow][prsentColum + 1] == '1') {
//                q.offer(new int[]{presentRow, prsentColum + 1, nowNode[2] + 1});
//            }
//            if (presentRow + 1 < maze.length && maze[presentRow + 1][prsentColum] == '1') {
//                q.offer(new int[]{presentRow + 1, prsentColum, nowNode[2] + 1});
//            }
//            if (prsentColum - 1 >= 0 && maze[presentRow][prsentColum - 1] == '1') {
//                q.offer(new int[]{presentRow, prsentColum - 1, nowNode[2] + 1});
//            }
            if (presentRow == maze.length - 1 && presentCol == maze[presentRow].length - 1) {
                System.out.println(nowNode.count + 1);
                break;
            }

        }


    }

    private static boolean isValid(char[][] maze, int newRow, int newCol) {
        return newRow >= 0 && newRow < maze.length &&
                newCol >= 0 && newCol < maze[newRow].length;
    }

    static class Node {
        int row;
        int col;
        int count;

        public Node(int row, int col, int count) {
            this.row = row;
            this.col = col;
            this.count = count;
        }
    }
}
