import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MagicShark {
    static final int[] dir_row = {0,-1,-1,-1,0,1,1,1};
    static final int[] dir_col = {-1,-1,0,1,1,1,0,-1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCol = scanner.nextInt();
        int pathCount = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        int[][] arr = new int[rowCol][rowCol];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int row = rowCol - 1;
        queue.add(row); // r
        queue.add(0); // c

        queue.add(row); // r
        queue.add(1); // c

        queue.add(row - 1);
        queue.add(0);

        queue.add(row - 1);
        queue.add(1);


        for (int i = 0; i < pathCount; i++) {
            int path = scanner.nextInt();
            int mover = scanner.nextInt();
            move(arr, dir_row[path-1], dir_col[path-1] , mover,queue);
            addWater(arr, queue);
            boolean[][] visited = new boolean[rowCol][rowCol];
            copyWaterBug(arr, queue, visited);
            remakeCloud(arr,visited,queue);
        }
        
        // 물의 양의 합을 구하라
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                sum +=arr[i][k];
            }
        }


        System.out.println(sum);



    }

    private static void copyWaterBug(int[][] arr, Queue<Integer> queue, boolean[][] visited) {
        final int size = queue.size()/2;

        for (int i = 0; i < size; i++) {
            Integer row = queue.poll();
            Integer coll = queue.poll();
            int indexMover = 1;

            visited[row][coll] = true;

            for (int j = 0; j < 4; j++) {
                if (isIndexFine(arr, row + dir_row[indexMover], coll + dir_col[indexMover])) {
                    if (arr[row + dir_row[indexMover]][coll + dir_col[indexMover]] != 0) {
                        arr[row][coll] += 1;
                    }
                }
                indexMover += 2;
            }
        }
    }
    private static boolean isIndexFine(int[][] arr, Integer row, Integer coll) {
        return arr.length > row &&
            0 <= row &&
            arr[0].length > coll &&
            0 <= coll;
    }



    private static void addWater(int[][] arr, Queue<Integer> queue) {
        final int size = queue.size();

        for (int i = 0; i < size/2; i++) {
            Integer row = queue.poll();
            Integer col = queue.poll();

            arr[row][col] += 1;

            queue.add(row);
            queue.add(col);
        }
    }

    private static void remakeCloud(int[][] arr, boolean[][] visited, Queue<Integer> queue){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] >= 2 && !visited[i][j]) {
                    arr[i][j] -= 2;
                    queue.add(i);
                    queue.add(j);
                }
            }
        }
    }

    private static void move( int[][] arr,int pathRow, int pathCol , int mover, Queue<Integer> queue) {
        final int qSize = queue.size();
        for (int i = 0; i < qSize/2; i++) {
            Integer row = queue.poll();
            Integer coll = queue.poll();
            int calculatedRow = row + pathRow * mover;
            int calculatedCol = coll + pathCol * mover;

            // row
            if (calculatedRow > arr.length - 1) { // 오른쪽이 넘치는 경우
                calculatedRow = calculatedRow % arr.length;
            }
            if (calculatedRow < 0) {
                while (calculatedRow < 0) {
                    calculatedRow += arr.length;
                }
            }
            // coll

            if (calculatedCol > arr[0].length - 1) { // 오른쪽이 넘치는 경우
                calculatedCol = calculatedCol % arr[0].length;
            }
            if (calculatedCol < 0) {
                while (calculatedCol < 0) {
                    calculatedCol += arr[0].length;
                }
            }
            queue.add(calculatedRow);
            queue.add(calculatedCol);
        }
    }
}
