import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums,100000)));
    }

    public static int[] getConcatenation(int[] nums, int n) {
        int count =n;
        int index =0;
        int[] res = new int[nums.length*n];
        while(count>0){
            for(int i=0;i<nums.length;i++){
                res[index++] = nums[i];
            }
            count--; // count = count -1;
        }

        return res;
    }
}
