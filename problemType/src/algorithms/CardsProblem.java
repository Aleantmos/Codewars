package algorithms;

import java.util.ArrayList;
import java.util.List;

public class CardsProblem {
    public static List<String> draw(List<String> deck) {
        List<String> values = new ArrayList<>(deck);
        List<String> result = new ArrayList<>();

        for (int i = 0; i < values.size(); i++) {
            result.add(values.remove(i));

            if (values.size() > 0) {
                values.add(values.get(i));
                values.remove(i);
                i--;
            }
        }
        return result;
    }
}
