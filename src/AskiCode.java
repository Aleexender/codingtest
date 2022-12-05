import java.util.Scanner;

public class AskiCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alpah = scanner.next().charAt(0);
        int num = (int) alpah; // 강제적으로 char -> int 로 변환
        System.out.println(num);

    }
}
