package woowacourse;

import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneInfo3 p = new PhoneInfo3(null, null, null);

        int restart = 1; // while문 반복

        while (restart == 1) {
            System.out.println("선택하세요...");
            System.out.println("1. 전화번호부 정보 입력");
            System.out.println("2. 전화번호부 정보 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 데이터 삭제");
            System.out.println("5. 프로그램 종료");
            int select = sc.nextInt(); // switch문 선택
            System.out.println();

            switch (select) {

                case 1: // 저장
                    p.Save();
                    break;

                case 2: // 조회
                    p.FindInfo();
                    break;

                case 3: // 이름으로 검색
                    p.SeachInfo();
                    break;

                case 4: // 삭제
                    break;

                case 5: // 종료
                    System.out.println("종료");
                    restart = 0; // while 반복종료
                    break;

                default:
                    System.out.println("다시 선택하세요.");
                    break;
            }

        }
    }

}
