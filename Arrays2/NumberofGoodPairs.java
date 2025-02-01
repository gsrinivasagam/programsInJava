import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int sol = 0;
        for (int n : nums) {
            int val = map.getOrDefault(n, 0);
            sol += val;
            map.put(n, val + 1);
        }

        return sol;

//        int count =0;
//        Arrays.sort(nums);
//        int prev=-1;
//        for (int n:nums) {
//            if(n==prev)
//                count++;
//            prev = n;
//        }
//
//        return count;
    }
}

