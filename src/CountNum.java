import java.io.*;

public class CountNum {


    public void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // 콘솔에 있는걸 빨리 읽기 위해
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out)); // 콘솔에 있는걸 빨리 쓰기위해서
        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        int C = Integer.parseInt(bufferedReader.readLine());
        final int unexchange = 9;
        int count = 0;

        Integer calculate = A * B * C;
//        int cal = A * B * C;

        String eachNum = calculate.toString();
//        String eachnum2 = String.valueOf(cal);

        for (int k = 0; k <= unexchange; k++ ) { // 1~9까지 돈다
            for (int i = 0; i < eachNum.length(); i++) { //eachnum에 들어간 숫자를 한번씩 돈다
                if(k == Character.getNumericValue(eachNum.charAt(i))){ // Character를 인트로 바꾼다 뭐를?  (String -> char 로 바꾼다.) --> 결론은 그냥 인트로 바꾸는거임 - k가 인트이기 때문에 인트로 비교를 해야함.
                    count ++;
                }
            }
            bufferedWriter.write(count+"\n"); //담는것
            count = 0;
        }
        bufferedWriter.flush(); // 콘솔로 output 느낌
    }
}
