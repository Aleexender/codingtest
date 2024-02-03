import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs { //1260번
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int node = scanner.nextInt();
        int edges = scanner.nextInt();
        int v = scanner.nextInt();
        int[][] qwe = new int[node][node];

        for (int i = 0; i < edges; i++) { // 복습
            int input1 = scanner.nextInt(); // 행
            int input2 = scanner.nextInt(); // 열
            qwe[input1 - 1][input2 - 1] = 1; // 예제 입력만을 보고 뽑을수 있는것
            qwe[input2 - 1][input1 - 1] = 1; // 노드 입력하면 확인
        }

        int[] arr = new int[node];
        fun(v - 1, qwe, arr);
        System.out.println();
        fun2(v-1,node,qwe);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(qwe[i][j]);
//            }
//            System.out.println();
//        }


    }

    static void fun(int start, int[][] qwe, int[] validate) { // DFS
        //base case 당장 풀수있는 문제 , 문제를 못풀때


        //recursive case 떠넘겨야지 알수있는것
        validate[start] = 1;
        System.out.print(start + 1 + " ");

        for (int i = 0; i < qwe[start].length; i++) { //방문을 할 노드를 찾는것 ( start 연결되어있는 노드를 찾는것 이 for문은 정형화 되어있음)
            if (qwe[start][i] == 1) { // 노드한개에서 1이 나올때
                if (validate[i] == 1) {
                    continue;
                }
//                arr[i] = qwe[start][i];
                fun(i, qwe, validate); // 그 카운트 된 노드 부터 다시 시작
            }
        }
    }
    /**
     * BFS
     *
     * q를 만든다
     * 시작점을 큐에 넣는다
     *
     * while (!q.isEmpty())
     *      nowNode = q에서 하나를 뽑는다
     *      if (방문한 노드라면)
     *          continue
     *      시작점을 방문처리한다
     *      (어떤 일을 하고)
     *      nowNode와 연결된 모든 노드를 다시 q에 넣는다
     */
    static void fun2(int start, int nodes, int[][] twoArray) { // BFS
        boolean[] visited = new boolean[nodes]; // 처음에는 전부다 false
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            Integer nowNode = q.poll();
            if (visited[nowNode]) {
                continue;
            }
            visited[nowNode] = true;

            // 실제로직
            System.out.print(nowNode + 1 + " ");

            // nowNode와 연결된 모든 노드를 다시 q에 넣는다(맨 뒤로 간다)
            for (int i = 0; i < twoArray[nowNode].length; i++) {
                if (twoArray[nowNode][i] == 1 && !visited[i]) {
                    q.offer(i);
                }
            }

        }
    }
}

