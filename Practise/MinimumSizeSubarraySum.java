package Practise;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1,2,3,4,5};
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(target, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int lp = 0;
        int rp = 0;
        int total = 0;  // Start with 0, not nums[lp]
        int minArr = Integer.MAX_VALUE;

        while (rp < nums.length) {
            // Expand the window by adding nums[rp]
            total += nums[rp];

            // Shrink the window from the left while total >= target
            while (total >= target) {
                minArr = Math.min(minArr, (rp - lp) + 1);
                total -= nums[lp];
                lp++;
            }

            // Move the right pointer
            rp++;
        }

        return minArr == Integer.MAX_VALUE ? 0 : minArr;
    }
}
