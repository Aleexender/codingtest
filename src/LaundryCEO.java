import java.util.Scanner;

public class LaundryCEO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int consistence = scanner.nextInt();
        int quarter = 0; //25
        int dime = 0; // 10
        int nickel = 0; // 5
        int penny = 0; // 1




        for (int i = 0; i < consistence; i++) {
            int money = scanner.nextInt();

            quarter = money /25 ;
            money %= 25;

            dime =  money/ 10;
            money %= 10;

            nickel = money / 5;
            money %= 5;

            penny = money / 1;
            money %= 1;

            System.out.print(quarter + " ");
            System.out.print(dime + " ");
            System.out.print(nickel + " ");
            System.out.print(penny + " ");
            System.out.println();
        }


    }
}
