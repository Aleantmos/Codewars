package fundamentals;

public class ProductArr {
    public static long[] productArray(int[] numbers) {

        long currProduct;
        long[] productArr = new long[numbers.length];

        int cnt = 0;
        while (cnt < productArr.length) {
            currProduct = 1;

            for (int num = 0; num < numbers.length; num++) {

                if (cnt != num) {
                    currProduct *= numbers[num];
                }

            }
            productArr[cnt] = currProduct;
            cnt++;
        }

        return productArr; // Do your magic!
    }
}
