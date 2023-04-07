import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players = scanner.nextInt();
        int[] num = new int[28];
        boolean[] valid = new boolean[28];
        boolean onlyOne = false;
            /*
