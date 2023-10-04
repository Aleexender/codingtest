import java.util.Scanner;

public class HanoiTop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        fun(n,1,3);
        System.out.println(count);
        System.out.println( save.toString());

    }

    static int count = 0;
    static StringBuilder save = new StringBuilder();

    public static void fun(int n, int from, int to) {
        //base case
        if (n == 1) {
            count++;
            save.append(from + " ").append(to).append("\n");
            return;
        }


        // recursive case
        int temp = 6 - from - to; // 안간곳 구하기

        fun(n - 1, from, temp); //안간곳으로 간다 나머지 한개 빼고

        fun(1, from, to);

        fun(n - 1, temp, to);


    }
}
