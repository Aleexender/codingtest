package lecture;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toLowerCase();
        char input = scanner.next().charAt(0);
        input = Character.toLowerCase(input);
        int count = 0;


//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == input) {
//                count++;
//            }
//        }

        for (char x : str.toCharArray()) {
            if (x == input) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//
//    public int Solution(String str, char t) {
//        int answer = 0;
//        str.toUpperCase();
//        t = Character.toUpperCase(t);
//        System.out.println(str);
//
//        return answer;
//    }
//}
