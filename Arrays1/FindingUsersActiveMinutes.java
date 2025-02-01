import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindingUsersActiveMinutes {
    public static void main(String[] args) {
        int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k = 5;
        System.out.println(Arrays.toString(findingUsersActiveMinutes(logs,k)));
    }

    public static int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result=new int[k];
        HashMap<Integer, HashSet<Integer>> map=new HashMap<>();

        for(int[] log:logs){
            int id=log[0];
            int t=log[1];
            if(!map.containsKey(id)) map.put(id,new HashSet<>());
            map.get(id).add(t);
        }

        for(int id:map.keySet()){
            int UAM=map.get(id).size();
            result[UAM-1]++;
        }
        return result;
    }
}
