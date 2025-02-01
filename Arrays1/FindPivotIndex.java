public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
        int i = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int s : nums) rightSum += s;

        for (; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return i== nums.length?-1:i;
    }
}
