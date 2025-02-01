import java.util.PriorityQueue;

public class ThirdMaximumPriorityQueue {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq =  new PriorityQueue<Integer>();

        for(int n : nums){
            pq.add(n);
            if(pq.size()>3) pq.poll();
        }
        if(pq.size()>=3)
            return pq.poll();
        else{
            Integer lastEle  = null;
            for(int n:pq){
                lastEle = n;
            }
            return lastEle;
        }
    }
}
