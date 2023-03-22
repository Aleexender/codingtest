import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NoStudyAbroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] divide = input.toCharArray();
        List<char[]> qwe = new LinkedList<>();
        qwe.add(divide);
        char[] cambridge = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};

        for (int i = 0; i < cambridge.length; i++) {
            if (qwe.contains(cambridge[i])) {
                qwe.remove(cambridge[i]);
            }
        }
        for (char[] a :qwe) {
            System.out.println(a);
        }
        System.out.println(input.replaceAll("[CAMBRIDGE]",""));
    }
}
