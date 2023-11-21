import java.util.Scanner;

public class Organic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for (int z = 0; z <testcase ; z++) {


            int row = scanner.nextInt();
            int colum = scanner.nextInt();
            int cabbage = scanner.nextInt();
            int warm = 0;
            boolean[][] validate = new boolean[row][colum];
            int[][] farm = new int[row][colum];

            for (int i = 0; i < cabbage; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                farm[x][y] = 1;
            }
            for (int i = 0; i < farm.length; i++) {
                for (int k = 0; k < farm[i].length; k++) {
                    if (farm[i][k] == 1 && validate[i][k] == false) {
                        warm++;
                        fun(i, k, farm, validate); // dfs 시작점
                    }
                }
            }
            System.out.println(warm);
        }

    }

    public static void fun(int row, int colum, int[][] farm, boolean[][] validate) { // bfs
        //base case 답을 바로 아는경우, 답이 안풀리는거
        validate[row][colum] = true;




        //recursive case 넘겨줄것
        if (row-1 >= 0 &&farm[row - 1][colum] == 1 && validate[row-1][colum] == false) { // 리팩토링
            fun(row-1,colum,farm,validate);
        } if (colum+1 < farm[row].length && farm[row][colum + 1] == 1 && validate[row][colum+1] == false) {
            fun(row,colum+1,farm,validate);

        } if (row+1 < farm.length &&farm[row + 1][colum] == 1&& validate[row+1][colum] == false) {
            fun(row+1,colum,farm,validate);

        }  if (colum-1 >= 0 && farm[row][colum - 1] == 1&& validate[row][colum-1] == false) {
            fun(row,colum-1,farm,validate);

        }


    }



}
