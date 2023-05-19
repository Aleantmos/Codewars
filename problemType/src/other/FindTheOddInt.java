package other;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {

    public static int findIt(int[] nums) {
        java.util.Map<Integer, Integer> data = new java.util.HashMap<>();
        int curr;

        for (int i = 0; i < nums.length; i++) {
            curr = nums[i];
            data.putIfAbsent(curr, 0);
            data.put(nums[i], data.get(curr) + 1);
        }

        int result = Integer.MIN_VALUE;

        for(java.util.Map.Entry<Integer,Integer> entry : data.entrySet()) {
            curr = entry.getValue();
            if (curr % 2 == 1) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }
}
