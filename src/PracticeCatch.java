import java.util.*;

public class PracticeCatch {

    public static int MIN_COUNT = Integer.MAX_VALUE;
    public static int TARGET = 17;
    public static int START = 5;
    public static Set<Integer> visited = new HashSet<>();

    public static void main(String[] args) {
        int subin = START;
        fun(subin, 0);
        System.out.println(MIN_COUNT);
    }

    public static void fun(int subin, int count) { // DFS
        if (count > MIN_COUNT || subin <= 0 || subin > TARGET * 2 || visited.contains(subin)) {
            return;
        }

        if (subin == TARGET) {
            if (count < MIN_COUNT) {
                MIN_COUNT = count;
            }
            return;
        }

        visited.add(subin);

        fun(subin + 1, count + 1);
        fun(subin - 1, count + 1);
        fun(subin * 2, count + 1);

        visited.remove(subin);
    }
}
