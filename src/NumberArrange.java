import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberArrange {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList();

        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(scanner.next()));

            Collections.sort(list);
        }
        long end = System.currentTimeMillis();
        System.out.println(list);


        System.out.println("SDB에서 노드생성까지의 실행시간 : " + (end - start)/1000.0);
    }
}
