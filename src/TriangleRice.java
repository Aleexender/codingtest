import java.util.Scanner;

public class TriangleRice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gram = scanner.nextInt();
        int price = scanner.nextInt();
        int count = scanner.nextInt();
        double[] totalPrice = new double[count+1];
        double minPrice = 0;
        for (int i = 1; i < count+1; i++) {
            int otherGram = scanner.nextInt();
            int otherPrice = scanner.nextInt();


            totalPrice[0] = (double) gram / price * 1000;
            totalPrice[i] = (double) otherGram / otherPrice * 1000;
        }
