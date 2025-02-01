//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//
//
//public class FrogJump {
//    public static void main(String[] args) {
//        int[] stones = {0,1,3,5,6,8,12,17};
//        System.out.println(canCross(stones));
//    }
//
//    public static boolean canCross(int[] stones) {
//        if (stones.length == 0) {
//            return true;
//        }+
//
//
//        Map<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>(stones.length);
//        map.put(0, new HashSet<Integer>());
//        map.get(0).add(1);
//        for (int i = 1; i < stones.length; i++) {
//            map.put(stones[i], new HashSet<Integer>() );
//        }
//
//        for (int i = 0; i < stones.length - 1; i++) {
//            for (int step : map.get(stones[i])) {
//                int reach = step + stones[i];
//                if (reach == stones[stones.length - 1]) {
//                    return true;
//                }
//                HashSet<Integer> set = map.get(reach);
//                if (set != null) {
//                    set.add(step);
//                    if (step - 1 > 0) {
//                        set.add(step - 1);
//                    }
//                    set.add(step + 1);
//                }
//            }
//        }
//
//        return false;
//    }
//}
