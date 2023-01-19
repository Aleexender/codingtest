import java.util.Scanner;

public class RugbyClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        int weight = 0;
        final int STANDARD_OF_WEIGHT = 80;
        final int STANDARD_OF_AGE = 17;
        final String JUNIOR = " Junior";
        final String SENIOR = " Senior";

        while (scanner.hasNext()) {
            name = scanner.next();
            age = scanner.nextInt();
            weight = scanner.nextInt();

            if (age == 0 || weight == 0) {
                break;
            }

            if (age > STANDARD_OF_AGE || weight >= STANDARD_OF_WEIGHT) {
                System.out.println(name + SENIOR);
            } else {
                System.out.println(name + JUNIOR);
            }
        }
    }
}
