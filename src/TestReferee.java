import java.util.Scanner;

public class TestReferee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testRoom = scanner.nextInt();
        int[] roomArray = new int[testRoom];
        for (int i = 0; i < roomArray.length; i++) {
            roomArray[i] = scanner.nextInt();
        }

        int mainCount = scanner.nextInt();
        int subCount = scanner.nextInt();

        long mainReferee = 0;
        long subReferee = 0;

        for (int i = 0; i < roomArray.length; i++) {
            int students = roomArray[i]; // 3

            students -= mainCount; // 총 은 무조건 한번씩 뺴야하니

            if(students > 0){
                subReferee += students / subCount;
                int leftStudents = students % subCount;

                if (leftStudents != 0) {
                    subReferee++;
                }
            }

            mainReferee++;
        }

        System.out.println(mainReferee + subReferee);
    }
}
