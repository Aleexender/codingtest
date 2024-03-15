import java.util.*;

public class Virus {
    static int count = 0 - 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerNum = scanner.nextInt();
        int computerPare = scanner.nextInt();
        int[][] twoArr = new int[computerNum][computerNum];// 꼭 값을 두개다 넣어야함


        boolean[] validate = new boolean[twoArr.length];

        for (int i = 0; i < computerPare; i++) {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();
            twoArr[input1 - 1][input2 - 1] = 1;
            twoArr[input2 - 1][input1 - 1] = 1;
        }
//        fun(0, twoArr, validate);
        fun2(0, twoArr, validate);
        fun(0, twoArr, validate);
        System.out.println(count);


    }


    public static void fun(int start, int[][] twoArr, boolean[] validate) { // DFS
        // base case 못푸는 문제거나, 딱보면 바로 알수있는 것들 (떠넘기지 않아도 되는것)


        // recursive case
        validate[start] = true;
        for (int i = 0; i < twoArr.length; i++) {
            if (validate[i]) {
                continue;
            }
            if (twoArr[start][i] == 1) {
                count++;
                fun(i, twoArr, validate);
            }
        }
    }

    public static void fun2(int start, int[][] twoArr, boolean[] validate) { // BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            Integer presentNode = queue.poll();


            if (validate[presentNode]) { // 이미 불린[] 방문했으면 컨티뉴
                continue;
            }

            validate[presentNode] = true;
            count++;


            for (int i = 0; i < twoArr[presentNode].length; i++) {
                if (twoArr[presentNode][i] == 1 && !validate[i]) {
                    queue.offer(i);
                }
            }
        }
    }
}
