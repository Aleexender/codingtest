import java.util.Scanner;

public class Plug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int[] plugs = new int[times];

        for (int i = 0; i < times; i++) {
            plugs[i] = scanner.nextInt();
            if (i == times - 1) {

            } else {
                plugs[i] -= 1;
            } 
        }
        
        int sum = 0;

        for (int k : plugs) {
            sum += k;
        }

        System.out.println(sum);
        
        
    }
}
