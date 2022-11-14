import java.util.Calendar;
import java.util.Scanner;
import java.util.Stack;

 class Palind {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String a = "";

        while (true) {

            a = String.valueOf(scanner.nextInt());
            if (a.equals("0")) {
                break;
            }
            char[] num = new char[a.length()];
            Stack<Character> stack = new Stack<>();

            // 스택에 넣기
            for (int i = 0; i < a.length(); i++) {
                stack.add(a.charAt(i));
            }
            //스택에서 뺴기
            for (int k = 0; k < a.length(); k++) {
                num[k] = stack.pop();
            }
            //비교하기
            if (a.equals(String.valueOf(num))) {
                System.out.println("yes");
            } else System.out.println("no");
            ;
        }


    }
}
public class Main{
    public static void main(String[] args) {
        Palind palind = new Palind();
        palind.test();
    }
}