import java.util.*;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> oddNums = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 7; i++) {
            int number = scanner.nextInt();

            if (number % 2 != 0) {
                count++;
                sum += number;
                oddNums.add(number);
            }
        }
