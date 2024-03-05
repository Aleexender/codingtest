import java.util.Scanner;

public class RoomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        char[] charArray = n.toCharArray();
        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < charArray.length; i++) {
            int num = charArray[i] - '0';
            if (num == 6) {
                numbers[9]++;
                continue;
            }
            numbers[num]++;
        }

        if (numbers[9] % 2 != 0) {
            numbers[9] = numbers[9] / 2 + 1;
        } else {
            numbers[9] = numbers[9] / 2;
        }


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);



    }
}
