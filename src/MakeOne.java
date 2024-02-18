import java.util.Scanner;

public class MakeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[] cache = new int[1000001];

        System.out.println(fun(value, cache));
    }

    private static int fun(int value, int[] cache) {
        int min = Integer.MAX_VALUE;
        // base case
        if (cache[value] != 0) {
            return cache[value];
        }

        if (value == 1) {
            return cache[value] = 0;
        }
        if (value < 1){
            return Integer.MAX_VALUE;
        }

        //base case 3 가지
        if (value % 3 == 0) {
            min = java.lang.Math.min(min, fun(value / 3, cache) + 1);
        }
        if (value % 2 == 0) {
            min = java.lang.Math.min(min,fun(value / 2, cache) + 1);
        }
        min = java.lang.Math.min(min, fun(value - 1, cache) + 1);

        cache[value] = min;
        return cache[value];
    }
}
