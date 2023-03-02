package Seven_kyu;

public class MultiplesOf3And5 {

    public int solution(int number) {
        int result = 0;

        if (number != 0) {
            for (int i = 1; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    result += i;
                }
            }
        }
        return result;
    }


}
