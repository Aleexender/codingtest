import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupWordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < time; i++) {
            String input = scanner.next();
            boolean isGroupWord = true;
            Map<Character, Integer> alphaToIndex = new HashMap<>();
            for (int k = 0; k < input.length(); k++) {
                if (!alphaToIndex.containsKey(input.charAt(k))) {
                    alphaToIndex.put(input.charAt(k), k);
                } else { // 들어가있다
                    Integer originIndex = alphaToIndex.get(input.charAt(k));
                    int difference = java.lang.Math.abs(originIndex - k); // -1 이 될수도 있으니까  안정 빵으로
                    if (difference >= 2) {
                        isGroupWord = false;
                        break;
                    } else {
                        alphaToIndex.put(input.charAt(k), k);
                    }
                }
            }
            if (isGroupWord) {
                count++;
            }
        }

        System.out.println(count);
    }
}
