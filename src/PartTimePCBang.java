import java.util.Scanner;

public class PartTimePCBang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] chair = new boolean[101];
        int people = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < people; i++) {
            int get = scanner.nextInt();

            if (chair[get]) {
                count++;
            }
            chair[get] = true;
        }
        System.out.println(count);
    }
}
