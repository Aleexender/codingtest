import java.util.Scanner;

public class Multi {//2588
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String multiNum = scanner.next();
        String[] split = multiNum.split("");
        int result = 0;

        for (int i = split.length-1; i >= 0; i--) {
            int changToInt = Integer.parseInt(split[i]);
            result = changToInt * num;
            System.out.println(result);
        }
