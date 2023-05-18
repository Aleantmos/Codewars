package other;

import java.util.Arrays;
import java.util.List;

public class ValidateCreditCardNumber {
    public static boolean validate(String n) {

        java.util.List<Integer> digits = new java.util.ArrayList<>(java.util.Arrays.stream(n.split(""))
                .map(Integer::parseInt)
                .toList());

        int cnt = digits.size() - 2;
        int curr = 0;
        int sum = 0;
        for (int i = cnt; i >= 0; i -= 2) {
            curr = digits.get(i);
            curr *= 2;
            if (curr > 9 ) {
                curr -= 9;
            }
            digits.set(i, curr);

            if (i == 1) {
                break;
            }
        }

        /* for (int digit : digits) {
            sum += digit;
        }*/

        sum += digits.stream().mapToInt(digit -> digit).sum();

        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
