import java.util.ArrayList;
import java.util.List;

public class Permutations2 {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(permute(nums).toString());
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        ans.add(temp);

        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> ans2 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                for (List<Integer> l : ans) {
                    List<Integer> temp2 = new ArrayList<>(l);
                    temp2.add(j, nums[i]);
                    ans2.add(temp2);
                }
            }
            ans = ans2;
        }
        return ans;
    }
}
