package woowacourse;

import java.util.Scanner;

public class PhoneInfo3 {
    // 필드
    private String name; // 이름
    private String ph; // 번호
    private String birth; // 생일

    int count = 1; // 클래스 변수

    Scanner sc = new Scanner(System.in); // 입력
    PhoneInfo3[] st = new PhoneInfo3[100]; // 저장갯수

    // constructor
    public PhoneInfo3(String name, String ph, String birth) {
        super(); // super()<- super 객체 하나만
        this.name = name;
        this.ph = ph;
        this.birth = birth;

    }

    public void Save() { // 저장
        System.out.print("이름 : ");
        String name1 = sc.nextLine();
        System.out.print("번호 : ");
        String ph1 = sc.nextLine();
        System.out.print("생일 : ");
        String birth1 = sc.nextLine();

        for (int i = 0; i < count; i++) {

            st[i] = new PhoneInfo3(name1, ph1, birth1);
            st[i].name = name1;
            st[i].ph = ph1;
            st[i].birth = birth1;
        }
        count++;
    }

    public void FindInfo() { // 조회
        System.out.println("====입력된 정보 출력====");
        System.out.println("=====================");

        for (int i = 0; i < count; i++) {
            System.out.println("이름 : " + st[i].name); //NPE : 값이 안들어가서 문제가 발생
            System.out.println("번호 : " + st[i].ph);
            System.out.println("생일 : " + st[i].birth);
            System.out.println();
        }
    }

    public void SeachInfo() { // 검색
        System.out.println("이름 : ");
        String seachName = sc.nextLine();

        for (int i = 0; i <= count; i++) {
            if (seachName.equals(st[i].name)) {
                System.out.println("이름 : " + st[i].name);
                System.out.println("번호 : " + st[i].ph);
                System.out.println("생일 : " + st[i].birth);
                break;
            }
        }
    }
}

