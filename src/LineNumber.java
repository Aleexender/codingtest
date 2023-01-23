import java.util.Arrays;
import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String[] qwe = new String[time];


//        for (int i = 0; i < time+1; i++) {
//
//
//            System.out.println((i +1) + ". " + scanner.nextLine());
//            }

        for (int i = 0; i < qwe.length; i++) {
            qwe[i] = scanner.nextLine();
            String zxc = qwe[i];

            System.out.println(i + 1 + ". " + zxc);
        }

        }
    }
