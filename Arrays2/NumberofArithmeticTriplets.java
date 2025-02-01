import java.util.HashSet;
import java.util.Set;

public class NumberofArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set set = new HashSet();
        for (int num : nums) {
            set.add(num);
            if (set.contains(num - diff) && set.contains(num - diff * 2))
                count++;
        }
        return count;
    }
}
