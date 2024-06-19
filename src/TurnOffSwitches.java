import java.util.Scanner;

public class TurnOffSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int switchNumber = scanner.nextInt();
        int[] switches = new int[switchNumber];
        for (int i = 0; i < switchNumber; i++) {
            switches[i] = scanner.nextInt();
        }

        int studentNum = scanner.nextInt();

        int[][] students = new int[studentNum][2];

        for (int i = 0; i < students.length; i++) {
            students[i][0] = scanner.nextInt();
            students[i][1] = scanner.nextInt()-1;
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i][0] == 1) {
                mansLogic(switches,students[i][1]);
            } else {
                girlsLogic(switches,students[i][1]);
            }
        }

        for (int i = 0; i < switches.length; i++) {
            if (i > 19 && i % 20 == 0) {
                System.out.println();
            }
            System.out.print(switches[i] + " ");
        }
    }

    private static void girlsLogic(int[] switches , int number) {
            changeSwitch(switches, number);

        int toLeft = number - 1;
        int toRight = number + 1;

        while (toLeft >= 0 && toRight < switches.length) {
            if (switches[toLeft] == switches[toRight]) {
                changeSwitch(switches, toLeft);
                changeSwitch(switches, toRight);

                toLeft -= 1;
                toRight += 1;
            } else {
                break;
            }
        }
    }

    private static void mansLogic(int[] switches, int number) {
        int count = number +1;
        for (int i = number; i < switches.length; i = i+ count) {
            changeSwitch(switches,i);
        }
    }

    private static void changeSwitch(int[] switches, int i) {
        if (switches[i] == 1) {
            switches[i] = 0;
        } else {
            switches[i] = 1;
        }
    }

}
