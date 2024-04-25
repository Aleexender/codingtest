import java.util.Arrays;
import java.util.Scanner;

public class QuadTree1992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char[][] square = new char[size][size];

        for (int i = 0; i <size ; i++) {
            String input = scanner.next();
            for (int j = 0; j <size ; j++) {
                square[i][j] = input.charAt(j);
            }
        }


//        for (int i = 0; i < square.length ; i++) {
//            for (int j = 0; j <square.length ; j++) {
//                square[i][j] = scanner.nextInt();
//            }
//        }
        fun(0, 0, square, square.length);

    }
// 시작점의 끝을 아느냐, 시작점과 길이를 아느냐
    public static void fun(int row, int colum ,char[][]square,int squareLength) {
        //Base case 리턴이 없고 -> 넘겨줄게 없다
        boolean isAllOne = true;
        boolean isAllZero = true;

        for (int i = row; i < row + squareLength; i++) {
            for (int j = colum; j < colum+squareLength; j++) {

                if (square[i][j] != '1') {
                    isAllOne = false;
                }
                if (square[i][j] != '0') {
                    isAllZero = false;
                }
            }
        }
        if (isAllZero) {
            System.out.print("0");
            return;
        }
        if (isAllOne) {
            System.out.print("1");
            return;
        }




        //Recursive Case
        System.out.print("(");

        for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
            fun(row+i*squareLength/2,colum+j*squareLength/2,square,squareLength/2);
            }
        }
        System.out.print(")");
    }
}
