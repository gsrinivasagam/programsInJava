package Investigate;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9, 3, 2, 1, 4, 5, 3, 6, 7, 2, 5, 1, 4, 9, 7};
        int k = 15;
        System.out.println(subarraySum(nums,k));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
