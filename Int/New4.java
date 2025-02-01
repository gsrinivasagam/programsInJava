package Int;

//Input : A[] = {1, 5, 9, 7, 1, 9, 4} Output : 2
//        subarray {1, 9} has both maximum and minimum value.
//        Input : A[] = {2, 2, 2, 2}Output : 1
//        2 is both maximum and
//        minimum here.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class New4 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 7, 1, 9, 4};
        System.out.println(contSubArr(arr));
    }

    public static int contSubArr(int[] arr){
            int[] copy = arr;
        Arrays.sort(copy);
        int min = copy[0];
        int max = copy[copy.length-1];
        boolean hasMin = false;
        boolean hasMax = false;
        int highestArray = 0;
        List<Integer> res =new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> list =new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                if(arr[j] == min) hasMin=true;
                if(arr[j] == max) hasMax=true;

                list.add(arr[j]);
                highestArray = list.size();

                if(hasMin && hasMax) {
                    if(list.size()<highestArray){
                        highestArray = list.size();
                        res = list;
                    }
                    continue;
                }
            }
        }

        return res.size();
    }
}
