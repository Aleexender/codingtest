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
        if (ascending ==true) {
            System.out.println("ascending");
            return;
        } // 내림차순
        boolean descending = true;
        for (int j = a.length-1; j >=1; j--) {
            if (a[j] > a[j - 1]) {
                descending = false;
                break;
            }
        } // 믹스드
        if (descending ==true) {
            System.out.println("descending");
            return;
        }
