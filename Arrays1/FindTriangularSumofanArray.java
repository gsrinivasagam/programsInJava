public class FindTriangularSumofanArray {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5};
        System.out.println(triangularSum(nums,nums.length));
    }

    public static int triangularSum(int[] res, int n) {
//        int[] res = new int[nums.length];
//
//        for(int i=0; i<nums.length;i++){
//            res[i] = nums[i];
//        }

        if(n == 1)
            return res[0];

//        for (int j = 1; j < res.length; j++) {
            for (int i = 1; i < n-1; i++) {
                res[i - 1] = res[i] + res[i - 1];
               res[i - 1] = res[i - 1] > 9 ? res[i - 1] % 10 : res[i - 1];
            }
//        }

        return triangularSum(res, n-1);

    }
}
