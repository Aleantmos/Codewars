package other;

public class MultiplicationTable {

    public static int[][] multiplicationTable (int size) {

        int[][] result = new int[size][size];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                result[i - 1][j - 1] = i * j;
            }
        }
        return result;
    }
}
