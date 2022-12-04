import java.util.Scanner;

public class StudyWords {
//    public static void main(String[] args) {
//        char now = 'm';
//        System.out.println(now - 'a');
//    }

    public void study() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] eachAlpha = alpha.toCharArray();
        int[] counts = new int[26];
        // Missi
        for (int i = 0; i < input.length(); i++) { // 입력받은 값을 하나씩 꺼낸다

            char now = input.charAt(i);
            int index = now - 'a';
            counts[index]++;

//            for (int j = 0; j <= eachAlpha.length; j++) { // 알파벳 수만큼 도는거, 입력받은 값을
//                input.charAt(i);
//                char each = eachAlpha[j];
//                if (input.charAt(i) == each) {
//                    int index = input.charAt(i) - 'a';
//                    counts[index]++;
//                }
//            }

        }


        System.out.println((char)('a' + 14));
    }
}