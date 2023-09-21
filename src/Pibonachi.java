import java.util.Scanner;

public class Pibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] cache = new int[num+1];
        System.out.println(fun(num, cache));
//        System.out.println(fun2(num));

    }
// 어떤 문제를 풀지 -> base case -> recursive
    static int fun( int num,int[] cache) {
        //base case -> 떠넘기냐 안떠넘기냐, 안떠넘기면 base case(떠넘기지 않아도 정답을 바로 구할수 있는것)
        if (num == 0) {
            return 0;
        }else if (num == 1) {
            return 1;
        }
        if (cache[num] != 0) {
            return cache[num];
        }
        cache[num] = fun(num - 1,cache)+fun(num-2,cache);

        //recursive 떠넘기면 recursive
        return cache[num];

    }

    static int fun2( int num) {
        //base case -> 떠넘기냐 안떠넘기냐, 안떠넘기면 base case
        if (num == 0) {
            return 0;
        }else if (num == 1) {
            return 1;
        }

        //recursive 떠넘기면 recursive
        return fun2(num - 1) + fun2(num - 2);

    }
}
