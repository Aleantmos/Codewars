package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringToCamelCase {

    public static String toCamelCase(String s) {

        String[] arrString = s.split("-|_");

        List<String> result = new ArrayList<>();

        for (int i = 0; i < arrString.length; i++) {

            if (i == 0) {
                result.add(arrString[i]);
            } else {

            String[] symbols =  arrString[i].split("");
            String firstSymbol = symbols[0].toUpperCase();
            symbols[0] = firstSymbol;


            result.add(String.join("", symbols));

            }
        }

        return String.join("", result);
    }

}
