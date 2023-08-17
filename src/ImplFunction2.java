import java.util.ArrayList;
import java.util.List;

public class ImplFunction2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4,};
        int[] answer = new int[101];
        boolean isVisited = false;

        for (int i = 0; i < arr.length; i++) {
            answer[arr[i]]++;
        }

        for (int a : answer) {
            if (a > 1) {
                System.out.println(a);
                isVisited = true;
            }
        }

        if (!isVisited) {
            System.out.println("-1");
        }
    }
}
