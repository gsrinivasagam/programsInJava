import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Countequalanddivisiblepairsinanarray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println(countPairs(nums,k));
    }

    public static int countPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list;
            if (!map.containsKey(nums[i])) {
                list = new ArrayList<>();
            } else {
                list = map.get(nums[i]);
                for (Integer j : list){
                    if ((i * j) % k == 0) count++;
                }
            }
            list.add(i);
            map.put(nums[i],list);
        }
        return count;
    }
}
