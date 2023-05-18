package other;

public class NotVerySecure {
    public static boolean alphanumeric(String s){

        /*if (s.isEmpty()) {
            return false;
        }*/

        if (s.trim().isEmpty()) {
            return false;
        }

        String[] elements = s.split("");

        for (int i = 0; i < elements.length; i++) {
            int currElement = elements[i].charAt(0);
            if (!(currElement >= 65 && currElement <= 90) && !(currElement >= 97 && currElement <= 122) && !(currElement >= 48 && currElement <= 57)) {
                return false;
            } else if (elements[i].equals(" ")) {
                return false;
            }
        }
        return true;
    }
}
