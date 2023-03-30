import java.util.ArrayList;
import java.util.Scanner;

public class EasyToSolve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        int first = scanner.nextInt();
        int sec = scanner.nextInt();
        int answer = 0;

        for (int i = 0; i <1000; i++) {
            for (int j = 0; j <= i; j++) {
                arrayList.add(i + 1);
            }
        }
        for (int i = first-1; i <=sec-1; i++) {
            answer += arrayList.get(i);
        }
        System.out.println(answer);
    }
}
