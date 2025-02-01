public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int leftProduct =1;
        int rightProduct=1;
        int n = nums.length-1;
        int maxVal = nums[0];
        for(int i=0;i<n+1;i++){
            leftProduct  = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct *= nums[i];
            rightProduct *= nums[n-i];
            maxVal = Math.max(maxVal,Math.max(leftProduct,rightProduct));
        }

        return maxVal;
    }
}
