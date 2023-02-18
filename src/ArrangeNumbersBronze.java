import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumbersBronze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
