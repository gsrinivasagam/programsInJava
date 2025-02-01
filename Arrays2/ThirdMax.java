import java.util.*;

public class ThirdMax {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet();
        for (int num : nums){
            set.add(num);
        }

        Iterator<Integer> desc = set.descendingIterator();
        int count =1;

        System.out.println("set "+set);
        while(desc.hasNext()){
            if(set.size() >= 3 && count == 3) return desc.next();
            if(set.size() <= 2 && count == 1) return desc.next();
//            if(set.size() == 1 && count ==1 ) return desc.next();
            desc.next();
            count++;
        }
        return -1;
    }
}
