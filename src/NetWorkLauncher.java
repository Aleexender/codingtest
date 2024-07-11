import java.util.Arrays;
import java.util.Scanner;

public class NetWorkLauncher {
    public static final int MAX_DISTANCE = 1_000_000_000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int houseCount = scanner.nextInt();
        int networkCount = scanner.nextInt();

        int[] arr = new int[houseCount];

        int[] array = Arrays.stream(arr).map(i -> scanner.nextInt()).sorted().toArray();

        findDistance();







    }

    private static int findDistance(int[] arr, int start , int end) { // 이분탐색을 하기위한 == 숫자를 찾기위한 방법
        // base case
        if (start == end) {
            return end;
        }

        int mid = start + (end - start) / 2;


        isDistanceInArr(arr,mid);


        //recursive case




    }

    private static boolean isDistanceInArr(int[] arr, int mid) { // 나온 숫자가 배열 사이에서 최소인지 찾는거
        for (int i = 0; i < arr.length; i++) { // 거리 마다 구하고 이 거리 나온 결과값에 mid 가 최소인지

        }
    }
}
