public class findTheDistanceValue {
    public static void main(String[] args) {
    int[] arr1 = {4,5,8}, arr2 = {10,9,1,8};
    int d = 2;
    System.out.println(findTheDistanceValue(arr1,arr2,d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int n1 : arr1){
            boolean flag = true;
            for(int n2 : arr2){
                if((n1-n2)<=d) {flag=false; break;}
            }
            if(flag) count++;
        }
        return count;
    }
}
