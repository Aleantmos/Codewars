package other;

public class FoldAnArray {
    public static int[] foldArray(int[] array, int runs) {

        int[] newArr = null;

        for (int i = 0; i < runs; i++) {
            int cnt = array.length/2;

            if (array.length % 2 == 1) {
                newArr = new int[cnt + 1];
            } else {
                newArr = new int[cnt];
            }


            //newArr = cnt % 2 == 0 ? new int[cnt] : new int[cnt + 1];

            for (int j = 0; j < cnt; j++) {
                newArr[j] = array[j] + array[array.length - 1 - j];
            }
            if (array.length % 2 == 1) {
                newArr[cnt] = array[cnt];
                if (newArr.length == 2 ) {
                    cnt = 1;
                } else {
                    cnt = (newArr.length / 2) + 1;
                }
            } else {
                cnt = newArr.length / 2;
            }
            array = newArr;
        }

        return newArr;
    }
}
