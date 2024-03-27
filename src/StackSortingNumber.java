import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackSortingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int lastPush = 0;
        int count = scanner.nextInt();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (lastPush < number) {
                while (lastPush != number) {
                    stack.push(++lastPush);
                    result.add("+");
                }
                stack.pop();
                result.add("-");
            } else {
                if (stack.pop() != number) {
                    System.out.println("NO");
                    return;
                } else {
                    result.add("-");
                }
            }

        }

        result.forEach(System.out::println);
    }
}
