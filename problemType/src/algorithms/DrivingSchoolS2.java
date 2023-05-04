package algorithms;

public class DrivingSchoolS2 {
    public static int cost(int mins){

        int hourCost = 30;
        int halfHourCost = 10;

        int total = 0;

        int hours = mins / 60;
        int minutes = mins % 60;

        if (hours >= 1) {
            total += hourCost;
            hours -= 1;
            if (hours > 0) {
                total += hours * 2 * halfHourCost;
            }
            int minutesLeft = minutes % 30;
            minutes -= minutesLeft;
            if (minutes != 0 ) {
                total += halfHourCost;
            }
            if (minutesLeft > 5) {
                total += halfHourCost;

            }
        } else {

            total += hourCost;
        }

        return total;
    }
}
