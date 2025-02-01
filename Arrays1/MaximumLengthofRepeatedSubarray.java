public class MaximumLengthofRepeatedSubarray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};
        MaximumLengthofRepeatedSubarray maximumLengthofRepeatedSubarray = new MaximumLengthofRepeatedSubarray();
        System.out.println(maximumLengthofRepeatedSubarray.findLength(nums1,nums2));
    }

    public int findLength(int[] nums1, int[] nums2) {
        int[][] ans =  new int[nums1.length+1][nums2.length+1];
        int max = 0;

        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if(nums1[i-1] == nums2[j-1]){
                    ans[i][j] = ans[i-1][j-1]+1;
                    max = Math.max(ans[i][j],max);
                }
            }
        }
        return max;
    }
}
