import java.util.Scanner;

public class GoDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowLength = scanner.nextInt();
        int[][] arr = new int[rowLength][3];



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] cache = new int[rowLength][3];
        int maxResult = defMax(arr, 0, 0,cache);
        int maxResult2 = defMax(arr, 0, 1,cache);
        int maxResult3 = defMax(arr, 0, 2,cache);

        int maxed = java.lang.Math.max(java.lang.Math.max(maxResult, maxResult2), maxResult3);
        System.out.print(maxed);

        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[0].length; j++) {
                cache[i][j] = 0;
            }
        }

        int minResult = defMin(arr, 0, 0, cache);
        int min1 = defMin(arr, 0, 1,cache);
        int min2 = defMin(arr, 0, 2,cache);
        int mini = java.lang.Math.min(java.lang.Math.min(minResult, min1), min2);

        System.out.print(" " + mini);

    }



    public static int defMax(int[][] arr, int row, int col, int[][] cache) {
        //base case
        if (cache[row][col] != 0) {
            return cache[row][col];
        }
        if(arr.length -1 == row){
            return arr[row][col];
        }



        int total = arr[row][col];


        int a = 0; // 맨 왼쪽
        int b = 0; // 가운데
        int c = 0;// 맨 오른쪽


        //base case
        if(col == 1){ // 가운데
            a = defMax(arr, row + 1, col - 1, cache);
            b = defMax(arr, row + 1, col, cache);
            c = defMax(arr, row + 1, col +1, cache);
            total+= java.lang.Math.max(java.lang.Math.max(a,b),c);

        } else if (col == 0) { // 왼쪽
            a = defMax(arr,row+1,col, cache);
            b = defMax(arr, row+1 ,col+1, cache);
            total += java.lang.Math.max(a, b);
        } else { // 오른쪽
            b = defMax(arr,row+1,col-1, cache);
            c = defMax(arr,row+1,col, cache);
            total += java.lang.Math.max(b, c);
        }

        cache[row][col] = total;
        return cache[row][col];

    }


    public static int defMin(int[][] arr, int row, int col, int[][] cache) {
        //base case

        if (cache[row][col] != 0) {
            return cache[row][col];
        }

        if(arr.length -1 == row){
            return arr[row][col];
        }

        int total = arr[row][col];

        int a = 0; // 맨 왼쪽
        int b = 0; // 가운데
        int c = 0;// 맨 오른쪽


        // recursive case
        if(col == 1){ // 가운데
            a += defMin(arr, row + 1, col - 1, cache);
            b += defMin(arr, row + 1, col, cache);
            c += defMin(arr, row + 1, col +1, cache);
            total+= java.lang.Math.min(java.lang.Math.min(a,b),c);

        } else if (col == 0) { // 왼쪽
            a = defMin(arr,row+1,col, cache);
            b = defMin(arr, row+1 ,col+1, cache);
            total += java.lang.Math.min(a, b);
        } else { // 오른쪽
            b = defMin(arr,row+1,col-1, cache);
            c = defMin(arr,row+1,col, cache);
            total += java.lang.Math.min(b, c);
        }
        cache[row][col] = total;
        return cache[row][col];


    }
}
