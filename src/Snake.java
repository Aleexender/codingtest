import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCol = scanner.nextInt();
        int[][] arr = new int[rowCol][rowCol];
        boolean[][] visited = new boolean[rowCol][rowCol];
        int appleTime = scanner.nextInt();

        for (int i = 0; i < appleTime; i++) {
            int appleRow = scanner.nextInt() - 1;
            int appleCol = scanner.nextInt() - 1;
            arr[appleRow][appleCol] = 1;
        }

        int time = scanner.nextInt();
        int timeCount = 0;
        /**
         *  0 -> 위
         * 1 -> 오른쪽
         * 2 -> 아래
         * 3 -> 왼쪽
         */

        visited[0][0] = true; // fixme 주의!
        queue.add(0);
        queue.add(0);

        Queue<Integer> pathTime = new LinkedList<>();
        Queue<String> direction = new LinkedList<>();
        for (int i = 0; i < time; i++) {
            pathTime.add(scanner.nextInt());
            direction.add(scanner.next());
        }


        while (true) {
            headRow += dirRow[headSide];
            headCol += dirCol[headSide];

            if (isLengthFine(arr, headRow, headCol) && !visited[headRow][headCol]) {
                if (arr[headRow][headCol] == 1) {//사과가 있는지 확인
                    arr[headRow][headCol] = 0;
                } else { // 사과가 없다
                    Integer removedRow = queue.poll();
                    Integer removedCol = queue.poll();

                    visited[removedRow][removedCol] = false;

                }
                System.out.println(headRow);
                System.out.println(headCol);
                System.out.println("time = " + totalTime);
                System.out.println("queue = " + queue.size());
                System.out.println("==============");
                queue.add(headRow);
                queue.add(headCol);
                System.out.println();
                visited[headRow][headCol] = true;
            } else { // 벽에 부딛침
                break;
            }

            if (!pathTime.isEmpty() && totalTime == pathTime.peek()) {
                moveHead(direction.poll());
                pathTime.poll();
            }
            totalTime++;
        }


        System.out.println(totalTime);
    }

    static final int[] dirRow = {-1, 0, 1, 0};
    static final int[] dirCol = {0, 1, 0, -1};
    static int headRow = 0;
    static int headCol = 0;

    static int totalTime = 1;
    static int headSide = 1;

    static Queue<Integer> queue = new LinkedList<>();



    private static void moveHead(String direction) {
        if (headSide == 0) {
            if (direction.equals("L")) {
                headSide = 3;
            } else {
                headSide = 1;
            }
        } else if (headSide == 1) {
            if (direction.equals("L")) {
                headSide = 0;
            } else {
                headSide = 2;
            }
        } else if (headSide == 2) {
            if (direction.equals("L")) {
                headSide = 1;
            } else {
                headSide = 3;
            }
        } else {
            if (direction.equals("L")) {
                headSide = 2;
            } else {
                headSide = 0;
            }
        }
    }

    private static boolean isLengthFine(int[][] arr, int headRow, int headCol) {
        return headRow < arr.length && headRow >= 0 && headCol < arr.length && headCol >= 0;
    }
}
