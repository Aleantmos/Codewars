package other;

import java.util.ArrayList;
import java.util.List;

public class FindTheParityOutlier {
    public static int find(int[] integers) {

        boolean isFound = true;

        java.util.List<Integer> odds = new java.util.ArrayList<>();
        java.util.List<Integer> evens = new java.util.ArrayList<>();
        int cnt = 0;
        int magicNum = 0;
        while (isFound) {

            boolean compriseFound = false;

            if (integers[cnt] % 2 == 0) {
                evens.add(integers[cnt]);
            } else {
                odds.add(integers[cnt]);
            }

            if ((evens.size() >= 2 && odds.size() == 1)) {
                magicNum = odds.get(odds.size() - 1);
                isFound = true;
                break;
            } else if ((odds.size() >= 2 && evens.size() == 1)) {
                magicNum = evens.get(evens.size() - 1);
                isFound = true;
                break;
            }
            cnt++;
        }
        return magicNum;
    }
}
