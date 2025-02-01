import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SumCounts {
    public static void main(String[] args) {
        Integer[] nums = {1,2,1};
        System.out.println(sumCounts(Arrays.asList(nums)));
    }

    public static int sumCounts(List<Integer> list) {
        int n=list.size();
        int ans=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++){
                int a=list.get(j);
                set.add(a);
                int size=set.size();
                ans+=size*size;
            }
        }
        return ans;
    }
}
