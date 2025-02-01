package Int;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class int7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        findPairByCollection(arr,8);
    }

    public static void findPairByCollection(int[] nums, int k){
    List<Integer> list = new ArrayList<>();
    for(int n : nums){
        list.add(n);
    }

        for (int i = 0; i < nums.length/2; i++) {
            if(list.contains(k-nums[i]) &&  (nums[i] != k-nums[i])){
                System.out.println("("+nums[i]+", "+(k-nums[i])+")");
            }
        }
    }

    public static void findPair(int[] nums, int k){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(k-nums[j] ==nums[i]){
                    System.out.println("("+nums[i]+", "+nums[j]+")");
                }
            }
        }
    }

}
