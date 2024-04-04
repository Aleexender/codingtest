import java.util.Scanner;

public class EasyStairCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 자리수
        int total = 0;

        int[][] cache = new int[n + 1][10];

        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[0].length; j++) {
                cache[i][j] = -1;
            }
        }

        for (int i = 1; i <= 9; i++) {
            total = (fun(n, i, cache) % 1000000000) + (total % 1000000000);

        }

        System.out.println(total % 1000000000);




    }

    private static int fun(int n, int currentNum, int[][] cache) {
        int total = 0;


        //base case
        if (currentNum == 10) {
            return 0;
        } else if (currentNum == -1) {
            return 0;
        }

        if (cache[n][currentNum] != -1) {//cache hit
            return cache[n][currentNum];
        }

        if(1 ==n){
            return 1;
        }



        // recursive case
        total += fun(n - 1, currentNum - 1, cache)% 1000000000;
        total += fun(n - 1, currentNum + 1, cache)% 1000000000;

        cache[n][currentNum] = total % 1000000000;

        return cache[n][currentNum];
    }
}
