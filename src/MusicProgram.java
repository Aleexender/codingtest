import java.util.*;
import java.util.stream.Stream;

public class MusicProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int singer = scanner.nextInt();
        int next = scanner.nextInt();
        int[][] arr = new int[singer][singer]; // 정사각형
        int[] ingoingEdges = new int[singer];
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> resutl2 = new LinkedList<>();
        boolean[] presentValidate = new boolean[arr.length];
        //입력
        for (int i = 0; i < next; i++) {

            int startNum = scanner.nextInt();
            int[] eachNode = new int[startNum];

            for (int j = 0; j < startNum; j++) { // 3 1 4 2 나왔으면 3번 반복
                int index = scanner.nextInt();
                eachNode[j] = index;
            }

            for (int j = 0; j < eachNode.length - 1; j++) { //2차원 배열 사용
                int row = eachNode[j] - 1; // 처음 숫자
                int colum = eachNode[j + 1] - 1; // 그다음 숫자
                if (arr[row][colum] == 1) {
                    continue;
                }
                arr[row][colum] = 1;
                ingoingEdges[colum]++; // 4한테 ingoingedge 가 1이있다
            }
        }
        boolean[] validate = new boolean[singer];

//        fun(ingoingEdges,arr,validate,result);



        for (int i = 0; i < singer; i++) {
            fun2(validate,i,resutl2,arr,presentValidate);
        }

        if (!DAGValidate) {
            System.out.println("0");
        } else {
            for (int i : resutl2) {
                System.out.println(i);
            }
        }
        // 핵심
//        for (int i = 0; i < singer; i++) {
//            boolean checkDAG = false;
//            int j;
//
//            for (j = 0; j < ingoingEdges.length; j++) {
//                if (ingoingEdges[j] == 0 && !validate[j]) {// 출발점
//                    validate[j] = true;
//                    checkDAG = true;
//                    result.add(j + 1);
//                    break;
//                }
//            }
//            if (!checkDAG) {
//                System.out.println("0");
//                return;
//            }
//            for (int k = 0; k < arr[i].length; k++) {
//                if (arr[j][k] != 0) { //j와 연결된 노드를 하나하나 다 본다.
//                    ingoingEdges[k]--;
//                }
//            }
//
//
//        }
//        for (int x : result) {
//            System.out.println(x);
//        }
    }

    public static void fun(int[] ingoingEdge, int[][] arr, boolean[] validate, List<Integer> result) { // BFS
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < ingoingEdge.length; i++) { // 출발점을 전부다 찾는다
            if (ingoingEdge[i] == 0) { // IngoingNode가 0인 것들이 출발점
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer number = queue.poll();
            result.add(number+1);
            validate[number] = true;
            // 핵심
            for (int i = 0; i < ingoingEdge.length; i++) {
                if (arr[number][i] == 1 && !validate[i]) { // 연결이 되어있는지 확인
                    ingoingEdge[i]--;
                    if (ingoingEdge[i] == 0) {
                        queue.offer(i);
                    }
                }
            }
        }
        for (int i = 0; i < validate.length; i++) { // DAG중에 하나라도 false가 있으면 사이클이 있다.
            if (!validate[i]) {
                System.out.println("0");
                return;
            }
        }
        for (int answer : result) {
            System.out.println(answer);
        }
    }

    static boolean DAGValidate = true;
    public static void fun2(boolean[] validate, int start, LinkedList<Integer> result, int[][] arr, boolean[] presentValidate) { //DFS
        // base case 넘겨주지 않아도 되는 경우
        if (validate[start]) {
            return;
        }

        validate[start] = true; // 방문 처리
        presentValidate[start] = true;


        //recursive case 떠넘겨 주는곳
        for (int i = 0; i < arr[start].length; i++) {
            if (arr[start][i] != 0) {
                if (presentValidate[i]) { // DAG를 검사 하는 로직
                    DAGValidate = false;
                    return;
                }
                if (!validate[i] && !presentValidate[i]) {
                    fun2(validate,i,result,arr,presentValidate);
                }
            }
        }
        presentValidate[start] = false; // 모든 DFS가 끝나고 더이상 갈곳이 없을때 validate를 초기화

        result.addFirst(start+1); // 맨 앞으로 넣어준다


    }
}



