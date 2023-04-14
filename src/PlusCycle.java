import java.util.Scanner;

public class PlusCycle {

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int count = 0;
    int nextResult = input; // 비교해야하기 때문에 따로 만듬




    public void logic() {

        while (true) {
            int left = nextResult / 10;
            int right = nextResult % 10;
            int currentResult = left + right;
            nextResult = right * 10 + currentResult % 10;
            count++;
            if (input == nextResult) {
                break;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        PlusCycle plusCycle = new PlusCycle();
        plusCycle.logic();
    }
}
