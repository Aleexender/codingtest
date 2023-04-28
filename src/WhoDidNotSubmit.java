import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhoDidNotSubmit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int studentNumWhoCall = 28;
        final int totalStudent = 30;
        boolean arr[] = new boolean[31];

        for (int i = 0; i < studentNumWhoCall ; i++) {
            int input = Integer.parseInt(bufferedReader.readLine());
            arr[input] = true;// 인덱스 번호로 들어간다.

        }
        for (int i = 1; i <= totalStudent; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
