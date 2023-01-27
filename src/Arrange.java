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

    static class Setting implements Comparable<Setting> {
    int x;
    int y;

//        public Setting(int x,int y) {
//            this.x = x;
//            this.y = y;
//        }

        //y좌표의 값이 낮으면 우선순위가 ]\낮다 => 숫자가 낮으면 빨리 빠져나간다
        //x좌표의 값이 낮음면 우선순위가 낮다. => ""
        @Override
        public int compareTo(Setting o) {
            if (this.y < o.y) {
                return -1;
            } else if (this.y > o.y) {
                return +1;
            } else {
                if (this.x < o.x) {
                    return -1;
                } else if (this.x > o.x) {
                    return +1;
                } else {
                    return 0;
                }
            }
        }
    }

}
