import java.util.Scanner;

public class MakeEnerGram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String wordDuplicate = scanner.nextLine();
        String[] divideWord = word.split("");
        String[] divideWord2 = word.split("");
        int count = 0;

