import java.util.Arrays;

public class Snow {
    public int[] solution(int n, int[] snow) {
        int[] answer = {};
        int[] mountain = new int[n];


            int one = mountain.length;

            for (int j = 0; j < mountain.length; j++) {
                int snowflake = 2 * (n - one) + 1; // 눈을 지탱할수 있는 무게

                mountain[j] = snowflake;
                one--;

                if (mountain[j] < snow[j]) {
                    int fallDown = snow[j] - mountain[j];
                    snow[j] -= fallDown;

                    if (j != snow.length - 1) { // 맨끝이냐
                        snow[j + 1] += fallDown;
                    }
                }
            }
        answer = snow;
        return answer;
    }

    public static void main(String[] args) {
        Snow snow = new Snow();
        System.out.println(Arrays.toString(snow.solution(6,new int[]{2,3,5,1,13,12})));
    }
}

