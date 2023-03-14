package algorithms;

public class BitCounting {
    public static int countBits(int n) {

        String concated = "";
        while (n != 0) {
            int bin = n % 2;

            String toConcat = String.valueOf(bin);

            concated = concated.concat(toConcat);

            n = n / 2;
        }

        String substring = "1";
        int cnt = 0;
        int index = 0;

        while (index != concated.length()) {
            if (concated.substring(index, index + 1).contains(substring)) {
                cnt++;
            }
            index++;
        }

        return cnt;
    }


}
