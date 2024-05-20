import java.util.Scanner;

public class TheMostAlpha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] alphabet = new int[26];

        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    alphabet[str.charAt(i) - 'a']++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max == alphabet[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] alphabet = new int[26];
//        int max = 0;
//
//        while (scanner.hasNextLine()) {
//            String a = scanner.nextLine();
//            char[] divide = a.toCharArray();
//
//            for (int i = 0; i < divide.length; i++) {
//                char alpha = divide[i];
//                if (alpha == ' ') {
//                    continue;
//                }
//                alphabet[alpha - 'a']++;
//            }
//        }
//
//            for (int i = 0; i < alphabet.length; i++) {
//                if (alphabet[i] < max) {
//                    max = alphabet[i];
//                }
//            }
//
//            for (int i = 0; i < alphabet.length; i++) {
//                if (max == alphabet[i]) {
//                    System.out.println((char) (i+'a'));
//                }
//            }
//
//    }
//}
