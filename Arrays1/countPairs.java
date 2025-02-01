import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class countPairs {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println(countPairs(nums,k));
    }

    public static int countPairs(int[] nums, int k) {
        HashMap<Integer, List<Integer>> map= new HashMap();
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                List<Integer> list= new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
            else
            {
                List<Integer> list= map.get(nums[i]);
                for(int j: list)
                {
                    if((i * j)%k==0)
                        count++;
                }
                list.add(i);
                map.put(nums[i], list);
            }
        }
        return count;
    }
}
