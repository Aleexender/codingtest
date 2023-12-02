import java.util.*;

public class WordArrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Word> words = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < size; i++) {
            String wordInput = scanner.next();
            if (hashSet.contains(wordInput)) {
                continue;
            } else {
                hashSet.add(wordInput); //넣어서 위에 if랑 비교해줘서 뺴주는거임
                words.add(new Word(wordInput));
            }
        }

        Collections.sort(words);


            for (Word word : words) {
                System.out.println(word.putword);
            }

    }


}


class Word implements Comparable<Word> {
    String putword;

    public Word(String word) {
        this.putword = word;
    }

    @Override
    public int compareTo(Word other) {
        if (this.putword.length() < other.putword.length()) {
            return -1;
        } else if (this.putword.length() > other.putword.length()) {
            return +1;
        } else {
            return this.putword.compareTo(other.putword);
        }
    }
}