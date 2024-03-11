import java.util.Arrays;
import java.util.Scanner;

public class SortingTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countN = scanner.nextInt();
        int[] arr = new int[countN];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countN; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);


        for (int i : arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);




    }
}
