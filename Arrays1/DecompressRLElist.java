import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRLElist {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int freq = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i % 2 == 0) {
                freq = nums[i];
            } else {
                for (int j = 0; j < freq; j++) {
                    list.add(nums[i]);
                }
            }
        }

        int[] s = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            s[i] = list.get(i);
        }

        return s;

//        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
