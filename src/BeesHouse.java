import java.util.Scanner;

public class BeesHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sectionLogic = 2;//8 ,20
        final int sectiononeend = 7;
        int previousSection = sectionLogic - 1;
        int answer = 0;

        if (input < sectionLogic) {
            System.out.println("1");
            return;
        } else if (input < sectiononeend) {
            System.out.println("2");
            return;
        }


        for (int i = 1; i < 100000000; i++) {
            sectionLogic = sectionLogic + 6 * i; // 누적합을 할려면 똑같은 로컬변수를 향해하한다.
            int insidenum = 6 * (i + 1);

            if (sectionLogic <= input && sectionLogic + insidenum - 1 >= input) {
                answer = i + 2;
                break;
            }
        }
        System.out.println(answer);
    }
}
