import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TheLeft {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Set<Integer> hashSet = new HashSet<>();
//        final int repeat = 10;
//        int count = 0;
//
//        for (int i = 0; i < repeat; i++) {
//            hashSet.add(scanner.nextInt()%42); // 중복이 안되서  중복되는 값은 제외
//        }
//
//        System.out.println(hashSet.size());

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[43];
        int num = 0;
        int index = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            num = scanner.nextInt();
            index = num % 42;

            arr[index]++;

            if (arr[index] == 1) {
                count += 1;
            } else {
                continue;
            }

//            if (arr[index] >= 1) { // 똑같은 값이 와도 해당 인덱스가 1을 넘어가지 못하게
//                arr[index] = 1;
//            }

        }


        System.out.println(count);

        System.out.println(Arrays.toString(arr));





    }
}
