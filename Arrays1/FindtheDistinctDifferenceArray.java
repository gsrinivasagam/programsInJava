import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindtheDistinctDifferenceArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            Set prefixSet = new HashSet();
            for (int j = 0; j <= i; j++) {
                prefixSet.add(nums[j]);
            }
            Set suffixSet = new HashSet();
            for (int j = nums.length - 1; j > i; j--) {
                suffixSet.add(nums[j]);
            }
            res[i] = prefixSet.size() - suffixSet.size();
        }
        return res;
    }
}
