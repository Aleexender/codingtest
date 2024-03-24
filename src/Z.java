import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double z = java.lang.Math.pow(2, N); // 제곱으로 만들어주는 메소드
        N = (int) z;
        int row = scanner.nextInt();
        int colum = scanner.nextInt();

        fun(0, 0, N, row, colum);
    }

    static int[] dirCol = {0, 1, 0, 1};
    static int[] dirRow = {0, 0, 1, 1};

    static int count = 0;
    static boolean valid = false;

    public static void fun(int row, int colum, int arrLength, int getRow, int getCol) {
        /* 배열을 자르는 방법
        1. 시작점과 끝점을 안다
        2. 시작점과 길이를 안다

        차이점은 끝점이냐 길이냐의 차이

        cache static 사용하면 안된다 , cache 자체적인 2차원배열을 static
        1. void타입이 아니여야 한다.
        2. cache 변수 빼곤 나머지는 static이면 부자연스럽다.
         */
        if (valid == true) { // ?
            return;
        }
        //나눌려면 시작점과 길이를 알거나, 끝점을 알아야한다
        // base case 넘겨줄수 없는거, 1 x1 때

        if (arrLength == 1) {
            if (row == getRow && colum == getCol) {
                System.out.println(count);
                valid = true;
            }
            count++;
            return;
        }


        //recursive case
        // Z모양으로 넘겨줘야 한다 -> 00 -> 0,1 -> 1,0 -> 1,1
        /*
        8x8이라고 가정을 하면
         3,1이면 1번째 블록
         4,2 면 3번째 블록
        if(2arr[row][colum] < arrlength/2  참 ->  if arr 0~3
         */



        int newRow = row + arrLength / 2;
        int newCol = colum + arrLength / 2;
        int oneSection = arrLength / 2 * arrLength / 2;

        if (getRow < row + arrLength / 2 && getCol < colum + arrLength / 2) {
            fun(row, colum, arrLength / 2, getRow, getCol);
        }
        if (getRow < row + arrLength / 2 && getCol >= colum + arrLength / 2) { //2번째 구역
            count += oneSection;
            fun(row, newCol, arrLength / 2, getRow, getCol);
        } else if (getRow >= row + arrLength / 2 && getCol < colum + arrLength / 2) {// 3번째 구역
            count += oneSection * 2;
            fun(newRow, colum, arrLength / 2, getRow, getCol);

        } else if (getRow >= row + arrLength / 2 && getCol >= colum + arrLength / 2) {//4번째
            count += oneSection * 3;
            fun(newRow, newCol, arrLength / 2, getRow, getCol);
        }

//        for (int i = 0; i < 4; i++) { // dirRow, dirCol
//            count += oneSection * i;
//            fun(row + arrLength / 2 * dirRow[i], colum + arrLength / 2 * dirCol[i], arrLength / 2, getRow, getCol); // dirRow, dirCol == turn off할수 있는 스위치이다
//        }
    }
}
