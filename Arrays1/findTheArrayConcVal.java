import java.util.ArrayList;
import java.util.List;

public class findTheArrayConcVal {
    public static void main(String[] args) {
        int[] arr = {49,73,50,95,89,43,62,24,88,88,36,6,16,14,2,42,42,60,25,4,58,23,22,27,26,3,79,64,20,92,63,56};
        System.out.println(findTheArrayConcVal(arr));
    }

    public static long findTheArrayConcVal(int[] nums) {
        List<Integer> list = new ArrayList();
        long sum =0;
        for(int n : nums){
            list.add(n);
        }

        while(!list.isEmpty()){
            if(list.get(0) == list.get(list.size()-1)){
                sum += list.get(0);
                break;
            }else{
                String newVal = Integer.toString(list.get(0))+
                        Integer.toString(list.get(list.size()-1));
                sum = sum+ Integer.parseInt(newVal);
            }
            list.remove(0);
            list.remove(list.size()-1);
        }

        return sum;
    }
}
