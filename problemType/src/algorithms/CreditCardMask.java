package algorithms;

public class CreditCardMask {

    public static String maskify(String str) {

        String masked = "";

        if (str.length() > 4) {
            for (int i = 0; i < str.length() - 4; i++) {
                masked = masked.concat("#");
            }

            String end = str.substring(str.length() - 4, str.length());

            masked = masked.concat(end);
        }

        return !masked.isBlank() ? masked : str;
    }
}
