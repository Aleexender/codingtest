import java.util.ArrayList;
import java.util.*;

public class OpenChat {
    public String[] solution(String[] record) {
        int count = 0;
        String[] answer = new String[record.length - count];
        HashMap<String, String> map = new HashMap<>();
        String[] movement = new String[record.length];
        String[] ID = new String[record.length];
        String[] nickName = new String[record.length];
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            movement[i] = record[i].split(" ")[0];
            ID[i] = record[i].split(" ")[1];
            nickName[i] = record[i].split(" ")[2];

            if (movement[i].equals("Enter")) {
                map.put(ID[i], nickName[i]);
            }
            if (movement[i].equals("Change")) {
                map.put(ID[i], nickName[i]);
                count++;
            }
        }
        for (int i = 0; i < record.length; i++) {
            if (movement[i].equals("Enter")) {
                answer[i] = nickName + "님이 들어왔습니다.";
            }
            if (movement[i].equals("Leave")) {
                answer[i] = nickName + "님이 들어왔습니다.";
            }
        }
        return answer;
    }
}
