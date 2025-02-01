import java.util.Arrays;

public class MakeArrayZerobySubtractingEqualAmounts {
    public static void main(String[] args) {
        int[] nums = {1, 5, 0, 3, 5};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int lowest = 0;
        for (int n : nums) {
            if (n > 0) {
                lowest = n;
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) nums[i] = nums[i] - lowest;
        }

        for (int n : nums) {
            if (n != 0) {
                count++;
                minimumOperations(nums);

            }
        }

        return count == 0 ? count : count+2;
    }

}
