import java.util.Scanner;

public class TriangleRice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gram = scanner.nextInt();
        int price = scanner.nextInt();
        int count = scanner.nextInt();
        double[] totalPrice = new double[count+1];
        double minPrice = 0;
