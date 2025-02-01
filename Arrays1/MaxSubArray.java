public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentSum  = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum;
    }
}
