package algorithms;

public class NarcissisticNumber {
    public static boolean isNarcissistic(int number) {

        String numAsString = number + "";
        String[] arrOfDigitsAsStrings = numAsString.split("");

        long power = arrOfDigitsAsStrings.length;
        long sumOfDigits = 0;

        for (int i = 0; i < arrOfDigitsAsStrings.length; i++) {
            long digit = Long.parseLong(arrOfDigitsAsStrings[i]);
            double toAdd = Math.pow(digit, power);


            sumOfDigits += toAdd;
        }

        return sumOfDigits == number;
    }
}
