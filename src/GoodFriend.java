import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // quantity of students
        int k = scanner.nextInt();// scoreBound
        int start = 0;
        int end = 0;
        long ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            String next = scanner.next();
            arr[i] = next.length();

        }

        for (int i = 0; i <= k; i++) { // first start
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);
            end++;
        }

        if (map.get(arr[start]) >= 2) {
            ans += map.get(arr[start]) - 1;
        }


        start++;


        while (start < arr.length) {

            if (end < arr.length) {
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);
            }

            //start
            Integer val = map.get(arr[start - 1]);
            map.put(arr[start - 1], val-1);

            if (map.get(arr[start]) >= 2) {
                ans += map.get(arr[start]) - 1;
            }

            start++;
            end++;


        }


        System.out.println(ans);

    }
}
