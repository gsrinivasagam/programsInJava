import java.util.HashSet;
import java.util.Set;

public class CountDistinctIntegers {
    public static void main(String[] args) {
        int[] nums = {1, 13, 10, 12, 31};
        System.out.println(countDistinctIntegers(nums));
    }

    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int n : nums) {
            set.add(n);
            int reverse = 0;
            while (n != 0) {
                reverse = reverse * 10 + n % 10;
                n = n / 10;
            }
            set.add(reverse);
        }

        return set.size();
    }
}
