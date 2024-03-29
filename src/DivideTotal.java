import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideTotal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            String temp = Integer.toString(i);
            int sum = 0;

            for(int j=0; j<temp.length(); j++) {
                sum += Character.getNumericValue(temp.charAt(j));
            }
            sum += Integer.parseInt(temp);

            if(sum == N) {
                System.out.println(temp);
                break;
            }
            else if(i==N) {
                System.out.println(0);
            }
        }
    }
}
