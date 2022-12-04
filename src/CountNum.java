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

        String eachnum = calculate.toString();
//        String eachnum2 = String.valueOf(cal);
