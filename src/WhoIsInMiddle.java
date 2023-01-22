import java.util.*;

public class WhoIsInMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);

        System.out.println(list.get(1));

    }
}
