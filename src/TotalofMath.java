import java.util.Scanner;

public class TotalofMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        String eachnum = scanner.next();

        String[] array = eachnum.split("");
        int total = 0;

        try {
            for (int i = 0; i < times; i++) {
                total += Integer.parseInt(array[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        System.out.println(total);
    }
}
