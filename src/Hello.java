import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = scanner.nextInt();
        int[] hp = new int[people];
        int[] happy = new int[people];
        int[][] cache = new int[101][people];

        for(int i =0; i< cache.length; i++){
            int[] ints = cache[i];
            Arrays.fill(ints, -1);
        }


        boolean[] isVisited = new boolean[people];

        for (int i = 0; i < people; i++) {
            hp[i] = scanner.nextInt();
        }
        for (int i = 0; i < people; i++) {
            happy[i] = scanner.nextInt();
        }


        int fun = fun(hp, happy, isVisited, 100, 0,cache);
        System.out.println(fun);
    }

    private static int fun(int[] hp, int[] happy, boolean[] isVisited, int currentHp, int index,
                           int[][] cache) {
        int fun = 0;

        // base case && cache miss
        if (currentHp <= 0) {
            return 0;
        }
        if (index > happy.length - 1) {
            return 0;
        }

        // cache hit
        if(cache[currentHp][index] != -1){
            return cache[currentHp][index];
        }


        //recursive case
        // 아 내가 미래(currentHP - hp[index]채력이 0 혹은 0 이하인지 판단하기
        // - 0 이하면 happy + X
        if(currentHp - hp[index] > 0){
            isVisited[index] = true;
            fun = fun(hp, happy, isVisited, currentHp - hp[index], index + 1, cache) + happy[index];// 고른다
            isVisited[index] = false;
        }


        int fun1 = fun(hp, happy, isVisited, currentHp, index + 1, cache);// 안고른다
        int max = java.lang.Math.max(fun1, fun);
        cache[currentHp][index] = max;

        return cache[currentHp][index];
    }
}
