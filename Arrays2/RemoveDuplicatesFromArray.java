import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int i =1;
        for (int n:nums) {
            if(n>nums[i-1]){
                System.out.println(Arrays.toString(nums));
                nums[i++] =n;
            }
        }

        return i;
    }
}
