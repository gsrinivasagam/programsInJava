public class Shuffle {
    public static void main(String[] args) {
    int[] nums = {2,5,1,3,4,7};
    int n=3;
        System.out.println(shuffle(nums,n));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int count =0;
        for(int i=0;i<nums.length/2;i++){
            res[count++] = nums[i];
            res[count++] = nums[i+n];
        }

        return res;
    }
}

