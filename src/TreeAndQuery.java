import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TreeAndQuery {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int q = Integer.parseInt(input[2]);
        int[] cache = new int[n];

        List<List<Integer>> arr2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr2.add(new ArrayList<>());
        }


        for (int i = 0; i < (n - 1); i++) {
            String[] split = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(split[0]) -1;
            int b = Integer.parseInt(split[1]) -1;

            arr2.get(a).add(b);
            arr2.get(b).add(a);
        }
        boolean[] verify = new boolean[n];
        fun(arr2, verify, r - 1, cache);

        for (int i = 0; i < q; i++) {
            int query = Integer.parseInt(bufferedReader.readLine()) -1;
            bufferedWriter.write(cache[query] + "\n");
        }
        bufferedWriter.flush();
    }



    public static int fun(  List<List<Integer>> arr, boolean[] verify, int start, int[] cache) {
        int count = 1;
        // base case
        if (cache[start] != 0) {
            return cache[start]; // 캐시 가져오기
        }
        if (verify[start]) {
            return 0;
        }


        verify[start] = true;

        // recursive case
        for (int i = 0; i < arr.get(start).size(); i++) {
            Integer node = arr.get(start).get(i);
            if (!verify[node]) {
                count += fun(arr, verify, node,cache);// turn on
            }
        }
        cache[start] = count;// 해당 노드의 카운트 캐시에 저장
        return count;
    }


}
