//import java.util.Scanner;
//
//public class StrangeMultiply {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] num = scanner.next().split("");
//        String[] num1 = scanner.next().split("");
//        long result = 0;
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num1.length; j++) {
//                int number = Integer.parseInt(num[i]);
//                int number1 = Integer.parseInt(num1[j]);
//                result += number * number1;
//
//            }
//        }
//        System.out.println(result);
//    }
//}
//

import java.util.Scanner;

public class StrangeMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String num1 = scanner.next();
        long result = 0;

        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num1.length(); j++) {
                int number = Character.getNumericValue(num.charAt(i));
                int number1 = Character.getNumericValue(num1.charAt(j));
                result += number * number1;

            }
        }
        System.out.println(result);
    }
}


