package other;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhoLikeIt {

    public static String whoLikesIt(String... names) {
        int cnt = names.length;

        if (cnt == 1) {
            return names[0] + " likes this";
        } else if (cnt == 2) {
            String output = java.util.Arrays.stream(names).limit(2).collect(java.util.stream.Collectors.joining(" and "));
            return output + " like this";
        } else if (cnt == 3) {
            String outputAnd = java.util.Arrays.stream(names).limit(2).collect(java.util.stream.Collectors.joining(", "));
            outputAnd = outputAnd + " and " + names[2];
            return outputAnd + " like this";
        } else if (cnt >= 4) {
            String output = java.util.Arrays.stream(names).limit(2).collect(java.util.stream.Collectors.joining(", "));
            int others = cnt - 2;
            return String.format("%s and %d others like this", output, others);
        }


        return "no one likes this";

    }
}
