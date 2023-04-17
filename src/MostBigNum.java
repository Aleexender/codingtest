import java.util.Scanner;

public class MostBigNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[9][9];
        int max = 0;
        int colum = 0;
        int row = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                num[i][j] = scanner.nextInt();

                if (num[i][j] > max) {
                    max = num[i][j];
                    row = i;
                    colum = j;
                }
            }
        }
