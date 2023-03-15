package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleEncryption {
    public static String encrypt(final String text, final int n) {


        if (text == null || text.isEmpty() || n <= 0) {
            return text;
        } else {

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            String result = text;
            for (int j = 0; j < n; j++) {
                List<String> symbols = Arrays.stream(result.split("")).toList();
                result = getString(even, odd, symbols);
                even.setLength(0);
                odd.setLength(0);

            }
            return result;

        }
    }

    public static String decrypt(final String encryptedText, final int n) {

        if (encryptedText == null || encryptedText.isEmpty() || n <= 0) {
            return null;
        } else {

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            String result = "";

            List<String> symbols = Arrays.stream(encryptedText.split("")).toList();

            for (int j = 0; j < n; j++) {
                result = getString(even, odd, symbols);

                symbols = Arrays.stream(result.split("")).toList();

                even.setLength(0);
                odd.setLength(0);
            }
            return result.toString();
        }
    }


    private static String getString(StringBuilder even, StringBuilder odd, List<String> symbols) {
        String result;
        for (int i = 0; i < symbols.size(); i++) {
            if (i % 2 == 1) {
                odd.append(symbols.get(i));
            } else {
                even.append(symbols.get(i));
            }
        }
        result = String.valueOf(odd.append(even));
        return result;
    }
}
