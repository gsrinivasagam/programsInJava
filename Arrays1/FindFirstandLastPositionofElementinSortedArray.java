import java.util.Arrays;
import java.util.HashMap;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int targetFirstIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                map.put(nums[i], i);
                if (targetFirstIndex == -1)
                    targetFirstIndex = i;
            }
        }
        int[] sol = {targetFirstIndex, targetFirstIndex == -1 ? -1 : map.get(target)};
        return sol;
    }
}
