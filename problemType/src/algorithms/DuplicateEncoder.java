package algorithms;

import java.util.BitSet;

public class DuplicateEncoder {

    public static String encode(String word) {


        char[] chars = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.toLowerCase().charAt(i);
        }

        BitSet previous = new BitSet();
        BitSet duplicate = new BitSet();

        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            if (previous.get(current)) {
                duplicate.set(current);
            } else {
                previous.set(current);
            }
        }

        StringBuilder sb = new StringBuilder(chars.length);
        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            sb.append(duplicate.get(current) ? ')' : '(');
        }
        return sb.toString();
    }
}
