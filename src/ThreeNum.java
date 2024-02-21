import java.util.Arrays;
import java.util.Scanner;

public class ThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int THREE = 3;

        int[] arr = new int[THREE];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}









// ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '0920';
// c