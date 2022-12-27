package lecture;

import java.util.Scanner;

public class ChangeWord {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) + "").toUpperCase().equals(input.charAt(i) + "")) {
//                input += (input.charAt(i) + "").toLowerCase();
                answer.append(String.valueOf(input.charAt(i)).toLowerCase());
            }else{
                answer.append(String.valueOf(input.charAt(i)).toUpperCase());
            }

        }
        System.out.println(answer);

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        String answer = "";
//        for (char x : input.toCharArray()) {
//            if (Character.isLowerCase(x)) {
//                answer += Character.toUpperCase(x);
//            } else {
//                answer += Character.toLowerCase(x);
//            }
//        }
//        System.out.println(answer);
    }
}
