import java.util.Scanner;

public class Chicken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            if (n == 0 && k == 0) {
                break;
            }
            int chicken = 0;
            chicken += n;
//            int maxCoupon = k;
//            int coupon = chicken / maxCoupon;
//            int restStamp = coupon / maxCoupon;
            while (n >= k) {
                n = n / k;
                chicken += n;
            }
            System.out.println(chicken);
        }
    }
}
