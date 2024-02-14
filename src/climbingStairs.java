import java.util.Scanner;

public class climbingStairs {
    /**
     * 재귀함수
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt(); // 계단 수
        int[] stairs = new int[index];

        int[][] cache = new int[3][index];

        for (int i = 0; i < index; i++) {
            stairs[i] = scanner.nextInt();
        }
        int fun = fun(stairs, 1, 0,cache);
        int fun1 = fun(stairs, 1, 1,cache);
        int max = java.lang.Math.max(fun1, fun);
        System.out.println(max);
    }


    private static int fun(int[] stairs, int stairCount, int index, int[][] cache) { // stairCount == 3개가 넘는지 안넘는지 확인하는 변수 2면 0으로 초기화 1칸씩이면 +1
        int max = 0;
        //base case

        if (stairCount == 3) {
            return 0;
        }
        if (stairs.length - 1 == index) {
            return stairs[index];
        }
        if (stairs.length <= index) {
            return 0;
        }
        if (cache[stairCount][index] != 0) {
            return cache[stairCount][index];
        }



        // recursive case

        //2 path

        int result = fun(stairs, stairCount + 1, index + 1,cache);// 1칸

        int result2 = fun(stairs, 1, index + 2,cache); //2 칸

        if (result2 == 0 && result == 0) {
            return 0;
        } else {
            max = java.lang.Math.max(result2, result) + stairs[index];
        }

        cache[stairCount][index] = max;

        return max;
    }


}
