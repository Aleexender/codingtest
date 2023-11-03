import java.util.Arrays;
import java.util.Scanner;

public class LostBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String formula = scanner.next();
        int answer = 0;
        String[] splitFormula = formula.split("-");

        answer += calc(splitFormula[0]);

        for (int i = 1; i < splitFormula.length; i++) {
            answer -= calc(splitFormula[i]);
        }


        System.out.println(answer);
    }

    static int calc(String formula) {
        String[] bracket = formula.split("\\+");
        return Arrays.stream(bracket).mapToInt(Integer::parseInt).sum();

    }
}
