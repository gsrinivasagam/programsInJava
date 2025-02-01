public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            int i = 0;
            while (n / 10 != 0) {
                n = n / 10;
                i++;
            }
            if (i % 2 != 0) count++;
        }
        return count;
    }
}
