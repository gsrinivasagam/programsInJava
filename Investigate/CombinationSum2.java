package Investigate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    public static void backtrack(List<List<Integer>> list, List<Integer> templist,
                          int[] nums, int remain, int start) {
        if (remain < 0) return;
        else if (remain == 0) list.add(new ArrayList<>(templist));
        else {
            for (int i = start; i < nums.length; i++) {
                templist.add(nums[i]);
                backtrack(list, templist, nums, remain - nums[i], i);
                templist.remove(templist.size() - 1);
            }
        }
    }
}
