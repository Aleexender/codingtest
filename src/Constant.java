import java.util.Scanner;
import java.util.Stack;

public class Constant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String num2 = scanner.next();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        String save = "";
        String save2 = "";


        final int threeNum = 3;

        for (int i = 0; i < threeNum; i++) {
            stack.push(num.charAt(i));
        }
        for (int k = 0; k < threeNum; k++) {
            stack2.push(num2.charAt(k));
        }

        for (int j = 0; j < threeNum; j++) {
           save += stack.pop();
            save2 +=stack2.pop();
        }
        if (save.compareTo(save2) > 0) {
            System.out.println(save);
        } else {
            System.out.println(save2);
        }

//        if (Integer.parseInt(save) < Integer.parseInt(save2)) {
//
//        }
    }
}
