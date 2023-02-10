import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fixedCost = scanner.nextInt();
        int originalCost = scanner.nextInt();
        int sellPrice = scanner.nextInt();
        int quantity = 0;


        while (true) {
            if (sellPrice <= originalCost) {
                System.out.println(-1);
                break;
            }
//            quantity++;
////            addProduct += sellPrice;
////            addProduct2 += originalCost;
//            if (fixedCost + addProduct2 < addProduct) {
//                System.out.println(quantity);
//                break;
//            }
            quantity = fixedCost / (sellPrice - originalCost);
            System.out.println(quantity+1);
            break;
//            if (total < sellPrice) {
//                System.out.println(quantity);
//                break;
//            }


        }
    }
}
