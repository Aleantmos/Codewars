package other;

public class FindUniqueNumber {
    public static double findUniq(double arr[]) {

        int index = -1;
        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                if (arr[0] != arr[1] && arr[1] == arr[2]) {
                    index = 0;
                }
            } else if (i == arr.length - 1) {
                index = arr.length - 1;
            } else if (i != arr[i - 1] && i != arr[i + 1]) {
                index = i;
                break;
            }
        }
        return arr[index];
    }

    /*
    public static double findUniq(double[] arr) {
      Arrays.sort(arr);
      return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
    */
}
