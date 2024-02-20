import java.util.*;

public class HanoiTopTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int step = scanner.nextInt();
        List<Stack<Integer>> desk = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            desk.add(new Stack<>());
        }
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "[DRV]");
        hashMap.put(2, "|DISPLAY|");
        hashMap.put(3, "|COMPUTE|");

        Stack<Integer> integers = desk.get(0);
        for (int i = 3; i >= 1; i--) {
            integers.push(i);
        }

        fun(n, 1, 3, step, desk);
        while (!desk.get(2).isEmpty()) {
            Stack<Integer> integers1 = desk.get(2);
            System.out.println(integers1.pop());

        }
        System.out.println(count);
        System.out.println(save.toString());

    }

    static int count = 1;
    static StringBuilder save = new StringBuilder();

    public static void fun(int n, int from, int to, int step, List<Stack<Integer>> desk) {
        //base case
        if (count == step) {
            return;
        }

        if (n == 1) {
            count++;
            Stack<Integer> fromDesk = desk.get(from-1);
            Stack<Integer> toDesk = desk.get(to-1);
            int fromValue = fromDesk.pop();
            toDesk.push(fromValue);
            return;
        }


        // recursive case
        int temp = 6 - from - to;

        fun(n - 1, from, temp, step, desk);

        fun(1, from, to, step, desk);

        fun(n - 1, temp, to, step, desk);


    }
}
