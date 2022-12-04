import java.util.Calendar;
import java.util.Scanner;
import java.util.Stack;

 class Palind {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String a = "";

        while (true) {

            a = String.valueOf(scanner.nextInt()); //int인걸 String으로
            if (a.equals("0")) { // 0 이면 끝나는 로직
                break;
            }
            char[] num = new char[a.length()];
            Stack<Character> stack = new Stack<>();

            // 스택에 넣기
            for (int i = 0; i < a.length(); i++) {
                stack.add(a.charAt(i)); // String 에서 char로 변환
            }
            //스택에서 뺴기
            for (int k = 0; k < a.length(); k++) {
                num[k] = stack.pop(); // num에 stack에서 pop했던걸 저장
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