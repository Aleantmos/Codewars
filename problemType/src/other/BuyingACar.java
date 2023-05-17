package other;

public class BuyingACar {
    public static int[] nbMonths(
            int startPriceOld,
            int startPriceNew,
            int savingMonth,
            double percentLossByMonth) {


        double oldCar = startPriceOld;
        double newCar = startPriceNew;

        int monthsCnt = 0;
        double savings = 0;
        double total = oldCar;
        while (total < newCar) {
            monthsCnt++;
            savings += savingMonth;

            if (monthsCnt % 2 == 0) {
                percentLossByMonth += 0.5;
            }

            oldCar = oldCar * (1 - percentLossByMonth/100);
            newCar = newCar * (1 - percentLossByMonth/100);

            total = savings + oldCar;
        }
        int rest = (int) Math.abs(Math.round((newCar) - (total)));
        int[] result = new int[]{monthsCnt, rest};
        return result;
    }
}
