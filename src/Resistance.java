import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Resistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        String[] color = new String[3];
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            color[i] = scanner.nextLine();
        }

        for (int i = 1; i < arr.length; i++) {

            arr[0] = 1;
            arr[i] = arr[i - 1] * 10;
        }

        for (int i = 0; i < 2; i++) {
            if (color[i].equals("black")) {
                num.append("0");
            }
            if (color[i].equals("brown")) {
                num.append("1");
            }
            if (color[i].equals("red")) {
                num.append("2");
            }
            if (color[i].equals("orange")) {
                num.append("3");
            }
            if (color[i].equals("yellow")) {
                num.append("4");
            }
            if (color[i].equals("green")) {
                num.append("5");
            }
            if (color[i].equals("blue")) {
                num.append("6");
            }
            if (color[i].equals("violet")) {
                num.append("7");
            }
            if (color[i].equals("grey")) {
                num.append("8");
            }
            if (color[i].equals("white")) {
                num.append("9");
            }

        }

        long change = Integer.parseInt(String.valueOf(num));

        if (color[2].equals("black") ) {
            change *= arr[0];
        }
        else if (color[2].equals("brown")) {
            change *= arr[1];
        }

        else if (color[2].equals("red")) {
            change *= arr[2];
        }
        else if (color[2].equals("orange")) {
            change *= arr[3];
        }
        else if (color[2].equals("yellow")) {
            change *= arr[4];
        }
        else if (color[2].equals("green")) {
            change *= arr[5];
        }
        else if (color[2].equals("blue")) {
            change *= arr[6];
        }
        else if (color[2].equals("violet")) {
            change *= arr[7];
        }
        else if (color[2].equals("grey")) {
            change *= arr[8];
        }
        else if (color[2].equals("white")) {
            change *= arr[9];
        }

        System.out.println(change);

        Map<String, Integer> colorValues = new HashMap<>();
        colorValues.put("black", 0);
        colorValues.put("brown", 1);
        colorValues.put("red", 2);
        colorValues.put("orange", 3);
        colorValues.put("yellow", 4);
        colorValues.put("green", 5);
        colorValues.put("blue", 6);
        colorValues.put("violet", 7);
        colorValues.put("grey", 8);
        colorValues.put("white", 9);

        int[] multipliers = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        String[] colors = new String[3];
        for (int i = 0; i < 3; i++) {
            colors[i] = scanner.nextLine();
        }

        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            numbers.append(colorValues.get(colors[i]));
        }

        long changer = Long.parseLong(numbers.toString()) * multipliers[colorValues.get(colors[2])];

        System.out.println(changer);


    }
}
