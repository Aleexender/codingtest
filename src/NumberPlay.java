import java.util.Arrays;
import java.util.Scanner;

public class NumberPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();

            if (input.equals("0")) {
                break;
            }

            String[] number = input.split("");

            fun(number);
        }

//        while (scanner.hasNext()) {
//            String input = scanner.next();
//            String[] change =input.split("");
//            int[] arr = new int[change.length];
//            int save = 0;
//            int save2 = 0;
//
//            if (input.equals("0")) {
//                break;
//            }
//
//            for (int i = 0; i < change.length; i++) {
//                arr[i] = Integer.parseInt(change[i]);
//                save += arr[i];
//            }
//            String change2 = Integer.toString(save);
//            String[] qwe = change2.split("");
////            int[] arr2 = new int[qwe.length];
//
//            for (int i = 0; i < qwe.length; i++) {
//                arr[i] = Integer.parseInt(qwe[i]);
//                save2 += arr[i];
//            }
//
//            System.out.println(save2);
//        }
    }

    public static void fun(String[] num) {
        //base case
        int result = 0;

        for (int i = 0; i < num.length; i++) {
            result += Integer.parseInt(num[i]);
        }


        //recursive case
        if (result / 10 == 0) {
            System.out.println(result);
        } else {
            fun(String.valueOf(result).split(""));
        }
    }

}
