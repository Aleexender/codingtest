import java.util.*;

public class RepresentNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int five = 5;
        int addAll = 0;
        int average = 0;
        List list = new ArrayList();
        int[] nums = new int[five];

        for (int i = 0; i < five; i++) {
            int num = scanner.nextInt();
            addAll += num;
            nums[i] = num;
            list.add(num);
        }

