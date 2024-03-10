import java.math.BigInteger;
import java.util.Scanner;

public class SailWantToClimb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = 0;
        long up = scanner.nextLong();
        long down = scanner.nextLong();
        long length = scanner.nextLong();
        long day = (length - down) / (up - down);

        if((length - down) % (up - down) != 0){
            day++;
        }
        System.out.println(day);
    }
}
