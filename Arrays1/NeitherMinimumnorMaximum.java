public class NeitherMinimumnorMaximum {
    public static void main(String[] args) {
        int[] nums = {2,1,3};
        System.out.println(findNonMinOrMax(nums));
    }

    public static int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int val = 0;

        for (int n : nums) {
            max = n > max ? n : max;
            min = n < min ? n : min;
        }
        for (int t : nums) {
            if (t != min && t != max) {
                val = t;
                break;
            }
        }

        return val == 0 ? -1 : val;
    }


}
