import java.util.Arrays;
import java.util.Scanner;

public class Arrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Setting[] inputArray = new Setting[count];

        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Setting setting = new Setting();
            setting.y = y;
            setting.x = x;
            inputArray[i] = setting;
//            inputArray[i] = new Setting(x, y); // x,y
        }

        Arrays.sort(inputArray);

        for (Setting setting : inputArray) {
            System.out.println(setting.x + " " + setting.y);
        }
    }
