import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//        double scoreSum = 0;
//
//        for (int i = 0; i < count+1; i++) {
//            String sub = scanner.nextLine();
//
//            if (sub.contains("A+")) {
//                scoreSum += 4.3;
//            } else if (sub.contains("A0")) {
//                scoreSum += 4.0;
//            }else if (sub.contains("A-")) {
//                scoreSum += 3.7;
//            }else if (sub.contains("B+")) {
//                scoreSum += 3.3;
//            }else if (sub.contains("B0")) {
//                scoreSum += 3.0;
//            }else if (sub.contains("B-")) {
//                scoreSum += 2.7;
//            }else if (sub.contains("C+")) {
//                scoreSum += 2.3;
//            }else if (sub.contains("C0")) {
//                scoreSum += 2.0;
//            }else if (sub.contains("C-")) {
//                scoreSum += 1.7;
//            }else if (sub.contains("D+")) {
//                scoreSum += 1.3;
//            }else if (sub.contains("D0")) {
//                scoreSum += 1.0;
//            } else if (sub.contains("D-")) {
//                scoreSum += 0.7;
//            } else {
//                scoreSum += 0.0;
//            }
//        }

//        System.out.println(String.format("%.2f", scoreSum / count));


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [][] arr = new String [n][3];

        double sum = 0;
        //학점 * 성적의 합이들어갈 변수
        double haksum = 0;
        //학점의 합이들어갈 변수
        for(int i = 0; i < n; i++) {
            double temp = 0;
            //한 과목의 성적이 임시로 들어갈 변수
            for(int j = 0; j < 3; j++) {
                arr[i][j] = scan.next();
            }
            String score = arr[i][2];
            if (score.charAt(0) == 'A') temp = 4;
            if (score.charAt(0) == 'B') temp = 3;
            if (score.charAt(0) == 'C') temp = 2;
            if (score.charAt(0) == 'D') temp = 1;
            if (score.charAt(1) == '+') temp += 0.3;
            if (score.charAt(1) == '-') temp -= 0.3;
            //각 스트링 값당 점수를 부여하는 과정

            sum += Integer.parseInt(arr[i][1]) * temp;
            //총합  = 학점 * 성적
            haksum += Integer.parseInt(arr[i][1]);
            //학점합  += 학점
        }

        System.out.println(String.format("%.2f", sum/haksum));
    }
}
