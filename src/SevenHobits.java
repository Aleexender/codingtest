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

        for (int i = 0; i < FAKE_PEOPLE -1; i++) {
            for (int j = i+1; j < FAKE_PEOPLE; j++) {
                if (sum - people[i] - people[j] == 100) {
                    people[i] = 0;
                    people[j] = 0;
                    Arrays.sort(people);
                    for (int k = 0; k < FAKE_PEOPLE; k++) {
                        if (people[k] == 0) {

                        } else {
                            System.out.println(people[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
