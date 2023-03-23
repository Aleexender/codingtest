import java.util.Scanner;

public class VacationHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int english = scanner.nextInt(); // 숙제 페이지
        int math = scanner.nextInt();
        int possibleEn = scanner.nextInt(); // 일일당 할수있는 페이지
        int possibleMa = scanner.nextInt();

        for (int i = day-1; i > 0; i--) {
            english -= possibleEn;
            math -= possibleMa;

            if (english <= 0 && math <= 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
