package Seven_kyu;

public class ReversedWords {

    public static String spinWords(String sentence) {

        String result = "";
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() >= 5) {
                StringBuilder sb = new StringBuilder();
                sb.append(words[i]);
                words[i] = sb.reverse().toString();
            }
            result = result.concat(words[i] + " ");
        }
        return result.trim();
    }
}
