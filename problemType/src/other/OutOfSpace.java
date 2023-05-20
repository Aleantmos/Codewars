package other;

public class OutOfSpace {

    public static String[] spacey(String[] array) {

        String[] result = new String[array.length];

        for (int i = 0; i <= array.length - 1; i++) {
            StringBuilder curr = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                curr.append(array[j]);
            }
            result[i] = curr.toString();
        }
        return result;
    }
}
