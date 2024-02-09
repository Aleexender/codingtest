import java.util.Scanner;

public class PartNumberResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int expectedValue = scanner.nextInt();
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }



        System.out.println(fun(expectedValue, values, 0, 0,0));


    }

    private static int fun(int expectedValue, int[] values, int totalValue, int index, int addedCount) { // back tracking
        int count = 0;
        //base case
        if (index == values.length) {
            return 0;
        }


        // recursive case
        // 넘긴다
        int currentValue = totalValue + values[index];
        if (currentValue == expectedValue) {
            count++;
        }
        int oneCase = fun(expectedValue, values, currentValue, index + 1, addedCount+1);


        // 안넘긴다
        int twoCase = fun(expectedValue, values, totalValue, index + 1, addedCount);

        return oneCase + twoCase + count;
    }
}
