import java.util.*;

public class ImplFunction {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 1};
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) +1);
            } else {
                map.put(arr[i], 1);
            }

        }
        List<Integer> qwe = new ArrayList<>(map.keySet());
        Collections.sort(qwe);
        for (int i : qwe) {
            if (map.get(i) != 1) {
                answer.add(map.get(i));
            }
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }

        if (answer.size() == 0) {
            System.out.println("-1");
        }
    }

}
