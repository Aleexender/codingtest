import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class SevenMinions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ONE_HUNDRED = 100;
        int sum = 0;
        int[] person = new int[9];

        for (int i = 0; i < person.length; i++) {
            person[i] = scanner.nextInt();
            sum += person[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                int current = person[i] + person[j];

                if (sum - current == ONE_HUNDRED) {
                    person[i] = 0;
                    person[j] = 0;

//                    for (int k = 0; k < person.length; k++) {
//                        if (k != i && k != j) {
//                            System.out.println(person[k]);
//                        }
//                    }
                    for (int k = 0; k < person.length; k++) {
                        if (person[k] != 0) {
                            System.out.println(person[k]);
                        }
                    }
                }
            }
        }

    }
}
