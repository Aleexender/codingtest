import java.util.Scanner;

public class FourSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[][] cache = new int[value+1][5];


        System.out.println(fun2(value, cache, 0));
    }

//    public static int fun(int value,int count,int[] cache) {
//        int minCount = 4;
//        // base case
//        if (count >= 4 || value < 0) {
//            return 4;
//        }
//
//        if (cache[value] != 0) {
//            return cache[value];
//        }
//
//        if (value == 0) {
//            return count;
//        }
//
//
//        //recursive case
//        for (int i = 1; i <= value; i++) {
//            if (i * (long)i > value) {
//                break;
//            }
//            int fun = fun(value - i * i, count + 1, cache);
//            cache[value] = fun;
//            minCount = java.lang.Math.min(fun, minCount);
//        }
//        cache[value] = minCount;
//
//        return minCount;
//    }

    public static int fun2(int value,int[][] cache, int count) {
        int minCount = 4;
        // base case
        if (count >= 4) {
            return 4;
        }

        else if (cache[value][count] != 0) {
            return cache[value][count];
        }

        if (value == 0) {
            return 0;
        }


        //recursive case
        for (int i = 1; i <= value; i++) {
            if (i * (long)i > value) {
                break;
            }
            int fun = fun2(value - i * i, cache, count + 1)+ 1;
            minCount = java.lang.Math.min(fun, minCount);
        }
        cache[value][count] = minCount;

        return minCount;
    }
}
