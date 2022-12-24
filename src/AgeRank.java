import java.util.Arrays;
import java.util.Scanner;

public class AgeRank {
    static class AgeName implements Comparable<AgeName> {
        String name;
        int age;

        AgeName(int age, String name) {
            this.age = age;
            this.name = name;
        }


        // 나이가 높으면 오름차순 -> 나이가 높으면 우선순위가 높다
        // 나이가 같으면 가입한사람이 먼저
        @Override
        public int compareTo(AgeName other) {
            if (this.age < other.age) {
                return -1;
            } else if (this.age > other.age) {
                return +1;
            } else { // 나이가 같을때
                return 0;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
            AgeName[] arrAgeName = new AgeName[count];

            for (int i = 0; i < count; i++) {
                int age = scanner.nextInt();
                String name = scanner.next();
               arrAgeName[i] = new AgeName(age,name);
            }

            Arrays.sort(arrAgeName);

            for (AgeName ageName : arrAgeName) {
                System.out.println(ageName.age + " " + ageName.name);
            }
        }



    }

}
