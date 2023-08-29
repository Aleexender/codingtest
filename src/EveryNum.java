import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EveryNum {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] check = new boolean[n];
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        fun(n,check,answer,count, bufferedWriter);
        bufferedWriter.flush();

    }

    public static void fun(int n, boolean[] check, List<Integer> answer, int count, BufferedWriter bufferedWriter) throws IOException {
        //base case

        if (count >= n) {
            for (int a : answer) {
                bufferedWriter.write(a + " ");
            }
            bufferedWriter.newLine();

            return;
        }


        // recursive case
        for (int i = 0; i < n; i++) {
            if (check[i]) {
                continue;
            }
            check[i] = true;
            answer.add(i+1);
            fun(n, check, answer,count+1,bufferedWriter);
            answer.remove(answer.size()-1);
            check[i] = false;

        }
    }
}