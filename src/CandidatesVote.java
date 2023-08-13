import java.util.Arrays;
import java.util.Scanner;

public class CandidatesVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candidate = scanner.nextInt();
        int dasom = scanner.nextInt();
        int[] vote = new int[candidate-1];
        int corruptPeople = 0;

        for (int i = 0; i < vote.length; i++) {
            vote[i] = scanner.nextInt();
        }
        if (candidate == 1) {
            System.out.println(0);
            return;
        }

        while (true) {
            Arrays.sort(vote);
            boolean gotOrNot = true;
            int theMostVotes = vote.length - 1;

            if (dasom <= vote[vote.length-1]) {
                dasom++;
                vote[theMostVotes]--;
                corruptPeople++;
                gotOrNot = false;
            }

            if (gotOrNot) {
                break;
            }

        }
        System.out.println(corruptPeople);
    }
}
