import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        /*
        결론은 부르트포스, 전체를 돌아야한다. -> 2일을 선택했으면 1일은 선택 못한다.
        부르투포스 == 1일 2일 3일 4일 을 돌면서 sum을 구해서 비교를 하자.
        중간에서 선택한경우 나머지 일수도 하나하씩 봐야한다.

        1. 3일이 주어졌을떄 해당 일을 포함한 나머지 2일은 일을 X
        2. 나머지 일수 4일을 하나하나씩 검사하면서 돈다.
        3. 합을 구해서 넘겨준다
         */
        Scanner scanner = new Scanner(System.in);


        int count = scanner.nextInt();
        int[] t = new int[count];
        int[] p = new int[count];

        for (int i = 0; i < count; i++) {
            t[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
        }


        fun(t, p,  0);
        System.out.println(max);
    }

    public static int sum = 0;
    public static int max = Integer.MIN_VALUE;

    // 최대한 스테틱만들지 말고 구현할껏
    public static void fun(int[] t, int[] p, int day) {

        //base case
        if (day >= t.length) {// 길이를 초과하는지 == 퇴사이후에 일이잡히는지
            max = java.lang.Math.max(sum, max);
            return;
        }


        //recursive case 백 트랙킹 이용
        for (int i = day; i < t.length; i++) {
            if (i + t[i] <= t.length) {
                sum += p[i];
            }
            fun(t, p, i + t[i]);
            if (i + t[i] <= t.length) {
                sum -= p[i];
            }
        }
    }

}
