import java.util.Scanner;

public class PaperNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[][] paper = new int[arraySize][arraySize];

        for (int i = 0; i < paper.length ; i++) {
            for (int j = 0; j < paper[i].length; j++) {
                paper[i][j] = scanner.nextInt();
            }
        }
        fun(0, 0, paper, paper.length);
        System.out.println(minusCount);
        System.out.println(zeroCount);
        System.out.println(plusCount);
    }

//    public static int[] number = {-1, 0, 1};
    public static int minusCount = 0;
    public static int plusCount = 0;
    public static int zeroCount = 0;

    public static void fun(int row, int colum, int[][] paper, int paperLength ) {
        //base case 떠넘길수 없는것
        boolean isAllMinus = true;
        boolean isAllPlus = true;
        boolean isAllZero = true;


        // 전체를 탐색하는법
        for (int i = row; i < row+paperLength; i++) {
            for (int j = colum; j < colum+ paperLength; j++) {
                if (paper[i][j] != -1) { // -1 아니면
                    isAllMinus = false;
                }
                if (paper[i][j] != 1) { // 1이 아니면
                    isAllPlus = false;
                }
                if (paper[i][j] != 0) { // 0 이 아니면
                    isAllZero = false;
                }
            }
        }
        if (isAllMinus) {
            minusCount++;
            return;
        }
        else if (isAllPlus) {
            plusCount++;
            return;
        }
        else if (isAllZero) {
            zeroCount++;
            return;
        }



        //recursive case 떠넘기는것 , 3 X 3 => 1 X 1
//        int qwe = 0;
//        for (int i = 0; i <3 ; i++) { // 컬럼만 나누기
////            fun(row, colum, paper, paperLength / 3); // 3등분할려고 paperLength에 나누기 3 할려는거임
////            fun(row, colum + paperLength / 3, paper, paperLength / 3);
////            fun(row, colum + paperLength / 3 + paperLength / 3, paper, paperLength / 3);
//            fun(row, colum+ qwe, paper, paperLength / 3);
//            qwe += paperLength / 3;
//        }
//        qwe = 0;
//        for (int i = 0; i < 3; i++) { // 로우만 나누기
//            fun(row + paperLength / 3, colum + qwe, paper, paperLength / 3);
//            qwe += paperLength / 3;
////            fun(row+paperLength/3, colum, paper, paperLength/3);
////        fun(row+paperLength/3, colum+paperLength/3, paper, paperLength/3);
////        fun(row+paperLength/3, colum+paperLength/3+paperLength/3, paper, paperLength/3);
//
//        }
//        qwe = 0;
//        for (int i = 0; i < 3; i++) { // 로우 컬럼 둘다
//            fun(row+paperLength/3+ paperLength/3, colum+qwe, paper,paperLength/3);
//            qwe += paperLength / 3;
////            fun(row + paperLength / 3 + paperLength / 3, colum, paper, paperLength / 3);
////            fun(row + paperLength / 3 + paperLength / 3, colum + paperLength / 3, paper, paperLength / 3);
////            fun(row + paperLength / 3 + paperLength / 3, colum + paperLength / 3 + paperLength / 3, paper, paperLength / 3);
//        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fun(row + i * paperLength / 3, colum + j * paperLength / 3, paper, paperLength / 3); // 필요한게 -> 출발점이랑 검사길이
            }
        }
    }

}
