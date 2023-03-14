package algorithms;

public class PersistentBugger {

    //my lame solution
    public static int persistence(long n) {

        String starting = String.valueOf(n);
        int cnt = 0;

        while (starting.length() != 1) {

            String[] split = starting.split("");

            long number = 1;

            for (int i = 0; i < split.length; i++) {
                number *= Long.parseLong(split[i]);
            }
            cnt++;
            starting = String.valueOf(number);
        }
        return cnt;
    }

    /* someones cool solution

    public static int persistence(long n) {
        if (n < 10) {
            return 0;
        }
        return 1 + persistence(multiplyDigits(n));
    }
    *//**
     * given an integer produce the product of the given integers digits.
     * example: multiplyDigits(785) = 7 * 8 * 5 = 280
     * @param n
     * @return the product of the digits that comprise n
     *//*
    private static long multiplyDigits(long n) {
        if (n < 10) {
            return n;
        }
        return n % 10 * multiplyDigits(n / 10);
    }*/
}
