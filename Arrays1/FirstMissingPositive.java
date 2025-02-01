import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (count < nums[i]) return count;
                else if (i < nums.length - 1 && (nums[i] != nums[i + 1])) {
                    count++;
                }
            }
        }

        return (nums[nums.length - 1]) > 0 ? nums[nums.length - 1] + 1 : 1;
    }

}
