import java.util.Scanner;
import java.util.Stack;

public class Stackcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        Stack<String> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            String input = scanner.next(); //띄어쓰기 기준
            if (input.equals("push")) {
                stack.push(scanner.next());
            } else if (input.equals("pop"))  {
                if (stack.isEmpty()) {
                   stringBuilder.append("-1"+"\n");
                } else {
                    stringBuilder.append(stack.pop()+"\n");
                }
            } else if (input.equals("size")) {
                stringBuilder.append(stack.size()+"\n");
            } else if (input.equals("empty")) {
                if (stack.isEmpty()) {
                    stringBuilder.append("1"+"\n");
                } else {
                    stringBuilder.append("0"+"\n");
                }
            } else {
                if (!stack.isEmpty()) {
                    stringBuilder.append(stack.peek()+"\n");
                } else {
                    stringBuilder.append("-1"+"\n");
                }
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
