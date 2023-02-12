import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrangeNum {
    public static void main(String[] args) throws IOException {
        //   Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int quantity = Integer.parseInt(bufferedReader.readLine());
//        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
//            arrayList.add(number);

        }

        Arrays.sort(array);
//        Collections.sort(arrayList);

//        for (int a:arrayList) {
//            System.out.println(a);
//        }

//        for (int number: array) {
//            System.out.println(number);
//        }
        for (int i = 0; i < quantity; i++) {
            bufferedWriter.write(String.valueOf(array[i]) + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
