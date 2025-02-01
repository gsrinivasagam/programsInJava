public class FrogJump2 {
    public static void main(String[] args) {
    int[] stones = {0,1,3,5,6,8,12,17};
    System.out.println(canCross(stones));
}

    public static boolean canCross(int[] stones) {
        int pathLength = stones[1]-stones[0];
        for (int i = 2; i < stones.length; i++) {
            int jump = stones[i] - stones[i-1];
                if(!(jump == pathLength || jump == (pathLength-1) || jump == pathLength+1)) {
                    return false;
                }
                pathLength = jump;
        }

        return true;
    }
}
