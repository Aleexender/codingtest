import java.util.Arrays;
import java.util.Scanner;

public class numberSorting{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        for (int i : numbers) {
            System.out.println(i);
        }
    }
    static class Sorting implements Comparable<Sorting> {
        int numbers;

        public Sorting(int numbers) {
            this.numbers = numbers;

        }

        @Override
        public int compareTo(Sorting o) {
            if (this.numbers < o.numbers) {
            return -1;
            } else if (this.numbers > o.numbers) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}
