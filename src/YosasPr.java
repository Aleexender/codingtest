import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class YosasPr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = scanner.nextInt();
        int k = scanner.nextInt();
        int[] peoples = new int[people];
        boolean[] haveKilled = new boolean[people];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < people; i++) {
            peoples[i] = i + 1;
        }

        int index = 0;
        int count = 0;
        int killedPP = 0;
        while (true) {
            if (haveKilled[index % people]) {
                index++;
                continue;
            }
            count++;

            if (count == k) {
                haveKilled[index % people] = true;
                answer.add(peoples[index % people]);
                killedPP++;
                count = 0;
            }

            if (killedPP == people) {
                break;
            }

            index++;
        }

//        for (Integer i : answer) {
//            System.out.print(i + ", ");
//
//        }

        System.out.print("<");
        System.out.print(answer.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.print(">");
    }
}
