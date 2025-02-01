package int2;

import java.util.Arrays;

public class ArrayNew {
        public static void main(String[] args) {
            int[] a = {1,3,4,5,3,2,1};

            System.out.println(Arrays.toString(getArr(a)));
        }

    public static int[] getArr(int[] a){
        Arrays.sort(a);  //1,1,2,3,3,4,5}

        int j=1;
        int count=0;
        int[] res = new int[a.length];
        res[count++] = a[0];
        for(int i=0;i<a.length-1;){

            if(a[i]!=a[j]){
                res[count++] = a[j];
            }
            i++;
            j++;
        }
        return res;
    }
}
