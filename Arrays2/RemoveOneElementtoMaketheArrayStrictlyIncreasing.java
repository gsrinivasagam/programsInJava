public class RemoveOneElementtoMaketheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int nums[] = {1,2,10,5,7};
//                {105,924,32,968};
        System.out.println(canBeIncreasing(nums));
    }

    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int[] res = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                count++;
                int point = 0;
                if (count <= 1) {
                    for (int j = 0; j < nums.length; j++) {
                        if (j != i+1) {
                            res[point] = nums[j];
                            point++;
                        }
                    }
                } else return false;
            }
        }

        if (count > 0) {
            for (int i = 0; i < res.length - 1; i++) {
                if (res[i] >= res[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}


//   not working for all cases --
//    int count = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//        if (nums[i] >= nums[i + 1]) {
//        nums[i] = nums[i+1];
//        count++;
//        i = -1;
//        }
//        if (count > 1) return false;
//        }
//        return true;