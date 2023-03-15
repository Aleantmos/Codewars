package algorithms;

import java.util.ArrayDeque;

public class NumberInExpandedForm {

    public static String expandedForm(int num) {

        ArrayDeque<String> result = new ArrayDeque<>();
        int zeroCnt = 0;

        StringBuilder zeros = new StringBuilder();
        while (num > 0) {

            int currDigit = num % 10;
            num = num / 10;

            if (currDigit == 0) {
                zeroCnt++;
                continue;
            }
            for (int i = 0; i < zeroCnt; i++) {
                zeros.append(0);
            }
            String currResult = String.format("%d%s", currDigit, zeros);
            result.push(currResult);
            zeros.setLength(0);

            zeroCnt++;
        }
        return String.join(" + ", result);
    }
}
