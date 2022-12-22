import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class WordArrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Word[] words = new Word[count];

        for (int i = 0; i < count; i++) {
            String word = scanner.next();
            words[i] = new Word(word);

        }
        Arrays.sort(words);

        for (int i = 0; i < count; i++) {
            if (words[i].equals(words[i + 1])) {
            continue;
            }
            System.out.println(Arrays.toString(words));
        }

//        for (Word word : words) {
//            System.out.println(word.word);
//        }
    }

    static class Word implements Comparable<Word> {
        String word;

        public Word(String word) {
            this.word = word;
        }

        // 길이가 짧으면 우선순위가 낮은거
        // 길이가 같으면 영어순서가 높은 순서대로 ex) a vs b -> a 가 우선순위가 낮다
        @Override

        public int compareTo(Word other) {
            if (this.word.length() < other.word.length()) {
                return -1;
            } else if (this.word.length() > other.word.length()) {
                return +1;
            } else {
               return this.word.compareTo(other.word);

            }
        }
    }
}
