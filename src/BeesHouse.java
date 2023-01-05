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
