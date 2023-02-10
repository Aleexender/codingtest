import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double z = java.lang.Math.pow(2, N);
        N = (int) z;
        int row = scanner.nextInt();
        int colum = scanner.nextInt();

        int[][] arr = new int[N][N]; // 2 3  222
    }
    static int[] dirCol = {0, 1, 0, 1};
    static int[] dirRow = {0, 0, 1, 1};

    static int count = 0;
    public void fun(int row, int colum, int[][] arr, int arrLength) {
        //나눌려면 시작점과 길이를 알거나, 끝점을 알아야한다
        // base case 넘겨줄수 없는거, 1 x1 때
        if (arrLength == 1) {
            arr[row][colum] = count;
            count++;
            return;
        }


        //recursive case
        // Z모양으로 넘겨줘야 한다 -> 00 -> 0,1 -> 1,0 -> 1,1
        for (int i = 0; i < 4; i++) {
            int newRow = row + dirRow[i];
            int newCol = colum + dirCol[i];

            fun(newRow,newCol,arr,arrLength/2);
        }
    }
}
