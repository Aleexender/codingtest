import java.util.Scanner;

public class PianoLevel {
    public void level() {
        int[] a = new int[8];
        Scanner scanner = new Scanner(System.in);
        for (int k = 0; k < a.length; k++) { // scanner에 대입하기
            a[k] = scanner.nextInt();
        }

       // 오름차순
        boolean ascending = true;
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] > a[i + 1]) {
                ascending = false;
                break;
            }
        }
