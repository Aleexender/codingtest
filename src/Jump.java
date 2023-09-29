import java.util.Scanner;

public class Jump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameSize = scanner.nextInt();
        int[][] game = new int[gameSize][gameSize]; // 무조건 두개를 넣어야함 안그러면 NPE 뜸
        cache = new long[gameSize][gameSize]; // 무조건 두개를 넣어야 함

        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[i].length; j++) {
                cache[i][j] = -1;
            }
        }

        for (int i = 0; i < gameSize; i++) {
            for (int j = 0; j < gameSize; j++) {
                game[i][j] = scanner.nextInt();
            }
        }
        System.out.println(fun(0, 0, game));




    }
    //DP 문제
    private static long[][] cache;
    // return 해서 return 이용하는거, static 변수 만들어서 카운트 하는 방식 -> 캐싱불가 -> DP도 안됨
    public static long fun(int row, int colum, int[][] game) {//DFS 계산 되었는지 물어보는것 + 계산된걸 리턴하기 전에 저장하는것
        //base case 떠넘기지 않아도 되는것
        if (!isValid(game, row, colum)) { // 떠넘기지 않아도 되는것
            return 0;
        }
        else if (cache[row][colum] >= 0) {// 값이 있으면 , 중복 제거
            return cache[row][colum];
        }
        else if (game[row].length - 1 == colum && game.length - 1 == row) { // 뭐가 되었건 끝만 왔으면 카운트를 해줘
            return 1; //경로의 수
        }

        if (game[row][colum] == 0) { // 중간에 0이 나오면 계산하지마
            return 0;
        }
        //recursive case
        else { // 없으면
            cache[row][colum] = fun(row + game[row][colum], colum, game) + fun(row, colum + game[row][colum], game);
            return cache[row][colum];
        }
        }



//        for (int i = 0; i < 2; i++) {
//            nextRow = row + difRow[i] * game[row][colum];
//            nextCol = colum + difCol[i] * game[row][colum];
//        }
//            // 아래랑 옆이 아웃오브어레이만 안나게하기
//            if (isValid(game, nextRow, nextCol)) {
//                fun(nextRow, nextCol, validate, game);
//
//            }
//        }

    private static boolean isValid(int[][] game, int newRow, int newColum) {
        return newRow < game.length && newColum < game[newRow].length;
    }
}
