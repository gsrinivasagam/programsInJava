import java.util.HashMap;
import java.util.Map;

public class repeatedNTimes {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        System.out.println(repeatedNTimes(nums));
    }

    public static int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int n : map.keySet()){
            if(map.get(n)>1) return n;
        }

        return 0;
    }
}
