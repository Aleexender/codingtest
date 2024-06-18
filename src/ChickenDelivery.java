import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChickenDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]); // n X n square
        int m = Integer.parseInt(firstLine[1]); // maximum Chicken Store that I can pick

        int[][] arr = new int[n][n];

        List<Integer> houses = new ArrayList<>();
        List<Integer> chickens = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            for (int k = 0; k < n; k++) {
                arr[i][k] = Integer.parseInt(line[k]);
                if(arr[i][k] == 1){ // house
                    houses.add(i + 1);
                    houses.add(k + 1);
                } else if(arr[i][k] == 2) { // chicken
                    chickens.add(i + 1);
                    chickens.add(k + 1);
                }
            }
        }

        boolean[] isVisited = new boolean[chickens.size()];

        fun(houses, chickens, m, new ArrayList<>(), isVisited);

        System.out.println(totalMin);
    }

    private static int totalMin = Integer.MAX_VALUE;

    private static int fun(List<Integer> houses, List<Integer> chickens, int m, List<Integer> checkedChicken,
                           boolean[] isVisited) {

        int sum = 0;

        // base case
        if (m == 0) {
            for (int i = 0; i < houses.size(); i += 2) {
                int min = Integer.MAX_VALUE;
                int houseRow = houses.get(i);
                int houseCol = houses.get(i + 1);
                for (int k = 0; k < checkedChicken.size(); k += 2) {
                    Integer chickenRow = checkedChicken.get(k);
                    Integer chickenCol = checkedChicken.get(k + 1);
                    int row = java.lang.Math.abs(houseRow - chickenRow);
                    int col = java.lang.Math.abs(houseCol - chickenCol);
                    min = java.lang.Math.min(row + col, min);
                }
                sum += min;
            }
            return sum;
        }

        // recursive
        for (int i = 0; i < chickens.size(); i += 2) {
            if (!isVisited[i]) {
                Integer row = chickens.get(i); // row
                Integer col = chickens.get(i + 1); // col
                checkedChicken.add(row);
                checkedChicken.add(col);
                isVisited[i] = true;
                isVisited[i + 1] = true;
                totalMin = java.lang.Math.min(fun(houses, chickens, m - 1, checkedChicken, isVisited), totalMin);
                isVisited[i] = false;
                isVisited[i + 1] = false;
                checkedChicken.remove(checkedChicken.size() - 1);
                checkedChicken.remove(checkedChicken.size() - 1);
            }
        }

        return totalMin;
    }
}
