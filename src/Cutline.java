import java.awt.*;
import java.sql.Array;
import java.util.*;

public class Cutline{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int prizeForPeople = scanner.nextInt();
        int count = 0;

        Integer[] eachPeople = new Integer[people];

        for (int i = 0; i < people; i++) {
            eachPeople[i] = scanner.nextInt();
        }

        Arrays.sort(eachPeople, Collections.reverseOrder());


        System.out.println(eachPeople[prizeForPeople-1]);



    }
}
