package lecture;

import java.util.Scanner;

public class SantanceInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String inputWord = scanner.nextLine();
//        String output = "";
//        String[] words = inputWord.split(" ");
//        int minValue = Integer.MIN_VALUE;
//
//
//        for (String s : words) { // split  해준 단어들 s에 넣어주기
//            int length = s.length();
//            if (length > minValue) {
//                minValue = length; //미니 벨류는 초기화후 값 넣어준다
//                output = s;
//            }
//        }
//        System.out.println(output);




        String str = scanner.next();
        int min = Integer.MIN_VALUE,pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String temp = str.substring(0, pos);
            int length = temp.length();
            if (length > min) {
                min = length;
                str = temp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > min) {
            System.out.println(str);;
        }



    }

}
