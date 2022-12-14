import java.util.Scanner;

public class BiggestLowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = -1000000; // 가장 작은수 부터 시작
        int min = 1000000; // 가장 큰수 부터 시작
//        Integer.MAX_VALUE
//        Integer.MIN_VALUE

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            max = java.lang.Math.max(num, max);
            min = java.lang.Math.min(num, min);

