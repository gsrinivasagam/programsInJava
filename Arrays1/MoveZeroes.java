import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums ={0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int k=0;
        for(int n : nums){
            if(n !=0 ){
                nums[k++] = n;
            }
        }

        if(k < nums.length){
            for(int i = k; i < nums.length;i++ ){
                nums[i] =0;
            }
        }
    }
}
