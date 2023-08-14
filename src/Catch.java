import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subin = scanner.nextInt();
        int brother = scanner.nextInt();
        fun(subin, brother);

    }

    public static void fun(int subin, int brother) { // BFS
        boolean[] validate = new boolean[100001];
        Queue<Count> queue = new LinkedList<>();

        queue.offer(new Count(subin,0));

        while (!queue.isEmpty()) {
            Count newSubin = queue.poll();

            int walk = newSubin.node + 1;
            int back = newSubin.node - 1;
            int jump = newSubin.node * 2;
            if (validate[newSubin.node]) { // 방문을 했었다
                continue;
            }
            validate[newSubin.node] = true;

            if (newSubin.node == brother) { //동생을 잡았냐
                    System.out.println(newSubin.count);
                    break;
                }
            if (isValid(walk, validate) && !validate[walk]) {
                queue.offer(new Count(walk, newSubin.count + 1));
            }
            if (isValid(back, validate) && !validate[back]) {
                queue.offer(new Count(back, newSubin.count + 1));
            }
            if (isValid(jump, validate) && !validate[jump]) {
                queue.offer(new Count(jump, newSubin.count + 1));
            }
        }

    }

    public static boolean isValid(int index, boolean[] validate) {
        return index < validate.length && index >= 0;
    }
}
class Count {
    int node = 0;
    int count = 0;

    public Count(int node, int count) {
        this.node = node;
        this.count = count;
    }
}
