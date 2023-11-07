import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < time; i++) {
            String q = scanner.nextLine();
            String[] s = q.split(" ");
            if (s[0].equals("push")) {
                queue.add(s[1]);
                System.out.println(s[1]);
            } else if (s[0].equals("pop")) {
                String poll = queue.poll();
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(poll);
                }
            } else if (s[0].equals("size")) {
                System.out.println(queue.size());
            } else if (s[0].equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println("0");
                }
            } else if (s[0].equals("front")) {
                String poll = queue.poll();
                System.out.println(poll);
            } else if (s[0].equals("back")) {
                for (int j = 0; j < queue.size(); j++) {
                    queue.poll();
                }
                String poll = queue.poll();
                System.out.println(poll);
            }

        }
    }
}
