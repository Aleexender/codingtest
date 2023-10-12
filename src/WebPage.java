import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class WebPage {
    public static void main(String[] args) {
        WebPage webPage = new WebPage();
        System.out.println(webPage.web("1 2 3 4 B B 42 B F F")); //3
        System.out.println(webPage.web("1 10 B B 20 1 F B B"));//4
    }

    public int web(String s) {

        String[] splited = s.split(" ");
        Stack<String> back = new Stack<>();
        Stack<String> forward = new Stack<>();
        Map<String, Integer> count = new HashMap<>();
        String currentPage = "";


        for (int i = 0; i < splited.length; i++) {
            if (splited[i].equals("B")) {
                if (back.isEmpty()) {
                    continue;
                }
                forward.push(currentPage);
                currentPage = back.pop();
            } else if (splited[i].equals("F")) {
                if (forward.isEmpty()) {
                    continue;
                }
                back.push(currentPage);
                currentPage = forward.pop();
            } else if (!currentPage.isEmpty()) {
                back.push(currentPage);
                forward.clear();
                currentPage = splited[i];
            } else if (currentPage.isEmpty()) {
                currentPage = splited[i];
            }


            count.put(currentPage, count.getOrDefault(currentPage, 0) + 1);

        }
        Integer max = Collections.max(count.values());

        return max;
    }
}
