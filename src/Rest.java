import java.util.*;
import java.util.stream.Collectors;

public class Rest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        HashSet<Integer> answer = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            nums.add(scanner.nextInt());
        }

        nums.stream().map(a -> a % 42).forEach(b -> answer.add(b));
        Long count = nums.stream().map(b -> b % 42).distinct().count();

