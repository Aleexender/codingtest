import java.util.Arrays;
import java.util.Scanner;

public class SevenHobits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int FAKE_PEOPLE = 9;
        int[] people = new int[FAKE_PEOPLE];
        int sum = 0;

        for (int i = 0; i < FAKE_PEOPLE; i++) {
            people[i] = scanner.nextInt();
            sum += people[i];
        }

