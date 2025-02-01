import java.util.Arrays;

public class FindGreatestCommonDivisorofArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        int last = Integer.MIN_VALUE, first = Integer.MAX_VALUE;
        for (int num : nums) {
            last = num > last ? num : last;
            first = num < first ? num : first;
        }
        int gcd = 1;
        for (int i = 2; i <= last; i++) {
            if (first % i == 0 && last % i == 0) gcd = i;
        }
        return gcd;
    }
}
