public class CountHillsAndValleysInAnArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,1,7};
        System.out.println(countHillValley(nums));
    }

    public static int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int j = i;
            int k = i;
            while (j > 1 && nums[j - 1] == nums[i]) {
                j--;
            }
            while (k < nums.length - 1 && nums[k + 1] == nums[i]) {
                k++;
            }
            if (((nums[j - 1] < nums[i] && nums[k + 1] < nums[i]) ||
                    (nums[j - 1] > nums[i] && nums[k + 1] > nums[i])) && nums[i - 1] != nums[i]) {
                count++;
            }
        }

        return count;
    }
}
