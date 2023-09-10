package lecture;

import java.util.Collections;
import java.util.Scanner;

public class FlipWord {
    public static void main(String[] args) {
        // String [] 에서  x라는 String으로 옮기고 거기서 reverse 시켜줘서 그대로 프린트
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String[] str = new String[count];

        for (int i = 0; i < count; i++) {
            str[i] = scanner.next();
        }
        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString(); // 문자 전체를 뒤집는법
//            System.out.println(tmp);
            String tem = new StringBuffer(x).reverse().toString();




            // 특정 문자만 뒤집는 방법
            char[] chars = x.toCharArray();
            int first = 0;
            int last = x.length() - 1;
            while (first < last) {
                char tmp = chars[first];
                chars[first] = chars[last];
                chars[last] = tmp;
                first++;
                last--;
            }
            String temp = String.valueOf(chars);
            System.out.println(chars);
        }

    }
}
