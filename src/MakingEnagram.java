import java.util.Scanner;

public class MakingEnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String otherInput = scanner.next();
        String[] split = input.split("");
        String[] otherSplit = otherInput.split("");
        int answer = 0;
        for (int i = 0; i < split.length; i++) {
            int count = 0;
            for (int j = 0; j < split.length; j++) {

                if (!split[i].equals(otherSplit[j])) {
                    count++;
                    if (count == split.length) {
                        answer++;
                    }
                }
            }
        }
