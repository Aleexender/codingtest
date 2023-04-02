import java.util.Scanner;

public class ConstantPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int[] arr = new int[8];
            int[] count = new int[8];
            boolean noRepeat = true;
            String[] a = scanner.next().split("");
            int max = 0;

            for (int k = 0; k < 8; k++) {
                arr[k] = Integer.parseInt(a[k]);
            }

            int z = 0;

            for (int k = 0; k < 7; k++) {
                if (arr[k] == arr[k + 1]) {
                    count[z]++;
                    noRepeat = false;
                } else {
                    z++;
                }
            }

            for (int k = 0; k < 8; k++) {
                if (max < count[k]) {
                    max = count[k];
                }
            }

            if (noRepeat) {
                System.out.println("1");
            } else {
                System.out.println(max + 1);
            }
        }
    }
}
