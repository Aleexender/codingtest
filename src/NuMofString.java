import java.util.Scanner;

public class NuMofString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int count = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        if (sentence.charAt(sentence.length()-1) ==' ') {
            count-= 1;
        }
        if (sentence.charAt(0) == ' ') {
            count-= 1;
        }
        System.out.println(count);

        sentence.split(" ");
    }
}