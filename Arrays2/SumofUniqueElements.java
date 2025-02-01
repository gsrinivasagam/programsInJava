import java.util.HashMap;

public class SumofUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int n : nums) {
            if (map.containsKey(n))
                map.put(n, map.get(n) + 1);
            else
                map.put(n, 1);
        }

        for (int t : map.keySet()) {
            if (map.get(t) == 1)
                sum += t;
        }

        return sum;
    }
}
