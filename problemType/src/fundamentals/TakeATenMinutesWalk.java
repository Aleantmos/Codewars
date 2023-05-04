package fundamentals;

public class TakeATenMinutesWalk {
    public static boolean isValid(char[] walk) {

        int length = walk.length;

        if (length / 2 == 5) {
            return true;
        }
        return false;
    }
}
