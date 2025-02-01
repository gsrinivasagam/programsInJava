public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (((nums[i] - 1) * (nums[j] - 1)) > max)
//                    max = ((nums[i] - 1) * (nums[j] - 1));
//                System.out.println("max" + max);
//                System.out.println("i" + i + "  j " + j);
//            }
//        }


        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
