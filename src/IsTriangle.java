import java.util.Arrays;
import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                return;
            }


            int powA = (int) java.lang.Math.pow(arr[0], 2);
            int powB = (int) java.lang.Math.pow(arr[1], 2);
            int powC = (int) java.lang.Math.pow(arr[2], 2);

            if (powA + powB == powC) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
