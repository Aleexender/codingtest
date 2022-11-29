import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OxQuiz {

    public void quiz(){
        Scanner scanner = new Scanner(System.in);
        int intsize =scanner.nextInt();


        for(int j = 0; j < intsize; j++) { // put a input each String
            String input = scanner.next();
            int[] value = new int[input.length()];
            int count = +1;
            int sum = 0;

