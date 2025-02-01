import java.util.Arrays;

public class KDiffPairsInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5}; //11345
        int k = 2;
        System.out.println(findPairs(nums,k));
    }


    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=0;
        int count=0;
        while(i< nums.length){

            if(nums[j]-nums[i] == k){
                i++;
                count++;
                if(nums[i]==nums[i-1]) i++;
            }else {
                if(j<nums.length)
                j++;
            }
        }

        return count;
    }
}
