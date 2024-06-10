import java.util.Arrays;
import java.util.Scanner;

public class CreateCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt(); // 만들어야할 알파벳 갯수
        int c = scanner.nextInt(); // 주어진 알파벳 갯수
        scanner.nextLine();
        String a = scanner.nextLine();
        String[] s = a.split(" ");

        boolean[] isVisited = new boolean[s.length];

        Arrays.sort(s);

        char[] arr = new char[l];

        fun(s,arr,0,0,isVisited);


    }

    private static void fun(String[] s, char[] arr, int count, int index, boolean[] isVisited) {
        // base case

        if(count == arr.length){ // 아 나는 arr 을 다 채웠다
            int countedVowels = countVowels(arr);
            int countedAlpha = countAlpha(arr);
            if(countedVowels  >= 1 && countedAlpha >= 2){
                for(char a:arr){
                    System.out.print(a);
                }
                System.out.println();
            }
            return;
        }

        if (index == s.length) { // s 의 길이만큼 다 갔을때
            return;
        }


        // recursive case

        for (int i = index; i < s.length; i++) {
            if(isVisited[i]){
                continue;
            }
            isVisited[i] = true;
            char currentChar = s[i].charAt(0); // do

            arr[count] = currentChar;
            fun(s,arr,count+1,i+1, isVisited);

            arr[count] = '0';
            isVisited[i] = false;
        }

    }

    private static int countAlpha(char[] arr) {
        int count =0;
        for (char c : arr) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                count++;
            }
        }
        return count;
    }

    private static int countVowels(char[] arr) {
        int count  =0;
        for (char c : arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}
