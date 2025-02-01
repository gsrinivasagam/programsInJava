import java.util.Arrays;

public class LeftRightDifference {
    public static void main(String[] args) {
        int[]  nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        for (int j = nums.length - 2; j >= 0; j--) {
            rightSum[j] = rightSum[j + 1] + nums[j + 1];
        }

        int[] sol = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sol[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return sol;

    }
}
