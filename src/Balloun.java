public class Balloun {
    public void start(int[][] scores, int[] darts){
        int result = 0;
        int[] columArray = new int[darts.length]; // col  == 5 -> 1 bingGo

        for (int dart : darts) {
            int index = dart -1;
            int row = index / 5;
            int col = index % 5;

            System.out.println(row);
            System.out.println(col);
            System.out.println();

//            result += scores[row][col];


        }
        int leftDart = darts.length - 5;
        result -= 10;
        for (int i = 0; i < leftDart; i++) {
            result -= 5;
        }
    }

    private int getRow(int index) {
        if (index <= 4) {
            return 0;
        }
        while (index <= 4) {
            index -= 4;
        }
        return index;
    }


    public static void main(String[] args) {
        Balloun balloun = new Balloun();
        balloun.start(new int[][]{{4, 9, 8, 10, 10}, {9, 2, 2, 5, 8}, {5, 10, 5, 3, 5}, {7, 9, 10, 5, 4}, {4, 4, 10, 1, 4}}, new int[]{4, 9, 14, 19, 24, 12, 23});
    }
}
