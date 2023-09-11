package lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class FlipOnlyWord {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        char[] split = input.toCharArray();
        String output;
        int lt = 0;
        int rt = split.length - 1;

        while (true) {
            while (lt < input.length() && !Character.isAlphabetic(split[lt]))
                lt++;
            while (rt >= 0 && !Character.isAlphabetic(split[rt]))
                rt--;

            if (lt >= rt) {
                break;
            }
            char temp = split[lt];
            split[lt] = split[rt];
            split[rt] = temp;
            lt++;
            rt--;
        }
        System.out.println(String.valueOf(split));
    }
}
