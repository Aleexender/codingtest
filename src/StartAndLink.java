import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class StartAndLink {
    public static int[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n][n];
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                arr[i][k] = scanner.nextInt();
            }
        }

        pickPlayer(n, visited, count, 0);


        System.out.println(answer);
    }
    public  static int answer = Integer.MAX_VALUE;
    private static void pickPlayer(int n, boolean[] visited, int count, int preNum) { // team 1
        //base case
        if (count == n / 2) {

            int diff = makeTeam(visited);
            answer=java.lang.Math.min(answer, diff);


            return;
        }

        //recursive case
        for (int i = preNum; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                pickPlayer(n, visited, count + 1, i);
                visited[i] = false;
            }
        }
    }

    private static int makeTeam(boolean[] players) {
        int sumForTeam1 = 0;
        int sumForTeam2 = 0;
        int diff = 0;


        for (int i = 0; i < players.length; i++) {
            if (players[i]) {
                for (int k = 0; k < players.length; k++) {
                    if (players[k] && i != k) {
                        sumForTeam1 += arr[i][k];
                    }
                }
            } else {
                for (int k = 0; k < players.length; k++) {
                    if (!players[k] && i != k) {
                        sumForTeam2 += arr[i][k];
                    }
                }
            }
        }
        diff = java.lang.Math.abs(sumForTeam1 - sumForTeam2);
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (Map.Entry<Integer,Integer> a : hashMap.entrySet()) {

        }
        return diff;
    }
}
