import java.util.Arrays;
import java.util.Scanner;

public class PartSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt(); // 10
        int minimumSum = scanner.nextInt(); // 15

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int allSum = Arrays.stream(arr).sum();

        if(allSum < minimumSum){
            System.out.println(0);
            return;
        }

        // rule
        /*
         1. 미니멈섬이 채워질때까지 오른쪽으로 이동한다
         2. 미니멈섬숫자 이상으로 커지면 왼쪽을 줄인다.
         3. 왼쪽으로 줄일때 미니멈섬 이하이면 오른쪽으로 다시 이동
         */

        int i1 = 0; // 선두주자
        int i2 = 0;  // 후발주자
        int sum = 0;
        int currLength = 0;
        int minLength = Integer.MAX_VALUE;

        while (i1 < length && i2 <= i1) {
            if(sum < minimumSum) { // minimumSum 보다 낮을떄
                sum += arr[i1];
                i1++;
                currLength++;
            }else{ // minimumSum 보다 높을때
                minLength = Math.min(minLength, currLength);
                sum -= arr[i2];
                i2++;
                currLength--;
            }
        }

        while(sum >= minimumSum && i2 < length) {
            minLength = Math.min(minLength, currLength);
            sum -= arr[i2];
            i2++;
            currLength--;

        }

        System.out.println(minLength);
    }
}
