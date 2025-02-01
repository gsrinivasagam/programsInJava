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
        int total = nums[lp];
        int minArr = Integer.MAX_VALUE;

        if (nums[lp] == target) return 1;

        while (lp < nums.length) {
            if (total == target)
                minArr = Math.min(minArr, (rp - lp) + 1);

            if (rp < nums.length && total > target || rp == nums.length - 1) {
                total = total - nums[lp];
                lp++;
            } else {
                if (rp < nums.length) {
                    rp = rp + 1;
                    total = total + nums[rp];
                }
            }
        }

        return minArr == Integer.MAX_VALUE ? 0 : minArr;
    }
}
