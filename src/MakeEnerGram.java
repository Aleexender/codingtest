import java.util.Scanner;

public class MakeEnerGram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String wordDuplicate = scanner.nextLine();
        String[] divideWord = word.split("");
        String[] divideWord2 = word.split("");
        int count = 0;

        for (int i = 0; i < divideWord.length; i++) {
            for (int j = 0; j < divideWord.length; j++) {
                if (!divideWord[i].equals(divideWord2[j])) {
                    count++;
                }

            }
        }
        System.out.println(count);


    }
}
