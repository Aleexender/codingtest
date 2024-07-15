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
        int maxLength = array[array.length - 1] - array[0];

        int distance = findDistance(array, 1, maxLength, networkCount);

        System.out.println(distance);


    }

    private static int findDistance(int[] arr, int start , int end, int networkCount) { // 이분탐색을 하기위한 == 숫자를 찾기위한 방법
        // base case
        if (start > end) {
            return 0;
        }

        if (start == end) {
            if(isDistanceInArr(arr, end, networkCount)){
                return end;
            }else{
                return 0;
            }
        }

        int mid = start + (end - start) / 2;



        boolean canInstall = isDistanceInArr(arr, mid,networkCount);

        //recursive case
        if(canInstall){
            return java.lang.Math.max(findDistance(arr, mid + 1, end, networkCount), mid);
        }else{
            return findDistance(arr, start, mid - 1, networkCount);
        }
    }

    private static boolean isDistanceInArr(int[] arr, int mid, int networkCount) { // 나온 숫자가 배열 사이에서 최소인지 찾는거
        int firstHouseLocation = arr[0];
        networkCount -= 1;

        for (int i = 1; i < arr.length; i++) { // 거리 마다 구하고 이 거리 나온 결과값에 mid 가 최소인지
            if(networkCount == 0){
                return true;
            }
            int houseLocation = arr[i];
            int distance = houseLocation - firstHouseLocation;
            if (distance >= mid) {
                networkCount -= 1;
                firstHouseLocation = houseLocation;
            }
        }
        if (networkCount <= 0) { // didn't install full wifi
            return true;
        }

        return false;
    }
}
