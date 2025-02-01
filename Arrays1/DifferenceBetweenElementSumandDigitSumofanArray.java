public class DifferenceBetweenElementSumandDigitSumofanArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;

        for (int n : nums) {
            eleSum += n;
            if (n / 10 != 0) {
                while (n != 0) {
                    int div = n % 10;
                    n = n / 10;
                    digitSum += div;
                }
            } else {
                digitSum += n;
            }
        }

        return eleSum - digitSum;
    }
}
