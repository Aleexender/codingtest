import java.util.Scanner;

public class StringAnalyise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {


            String sentence = scanner.nextLine();
            char[] changeSentence = sentence.toCharArray();

            int upperCase = 0;
            int lowerCase = 0;
            int num = 0;
            int space = 0;

            for (int i = 0; i < changeSentence.length; i++) {
                if (Character.isUpperCase(changeSentence[i])) {
                    upperCase++;
                } else if (Character.isLowerCase(changeSentence[i])) {
                    lowerCase++;
                } else if (Character.isDigit(changeSentence[i])) {
                    num++;
                } else {
                    space++;
                }
            }

            System.out.println(lowerCase + " " +upperCase + " " + num +" " + space);
        }
    }
}
