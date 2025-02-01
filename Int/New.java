package Int;
//
//find all possible Subarray with given sum
//        Input: arr[] = {1, 4, 0, 2, 3, 10, 5}, sum = 7  // 0,1,2,3,4,5,10
//        possible o/p : [4,3],[1,4,2],[5,2] [0,4,2,1]etc...

//stack will work
import java.util.List;

public class New {
    public static void main(String[] args) {
       int[] arr = {1, 4, 0, 2, 3, 10, 5};
       int sum = 7;
        getPairs(arr, sum);
    }

    public static void getPairs(int[] arr,int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i]+arr[j] == sum)){
                    System.out.println("["+arr[i]+", "+arr[j]+"]");
                }
            }
        }
    }
}
