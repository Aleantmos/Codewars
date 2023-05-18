package other;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JosephusPermutation {
    public static <T> List<T> josephusPermutation(final List<T> items, int k) {

        List<T> elements = new java.util.ArrayList<>(items);
        List<T> result = new java.util.ArrayList<>();
        int currIndex = -1;
        while (!elements.isEmpty()) {

            currIndex = (currIndex + k) % elements.size();

            if (currIndex > elements.size() - 1) {
                currIndex = currIndex - elements.size();

            }

            result.add(elements.get(currIndex));
            elements.remove(currIndex);
            currIndex -= 1;
            if (currIndex < 0) {
                currIndex = elements.size() - 1;
            }
        }

        return result;
    }
}
