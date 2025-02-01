package Investigate;

public class LargestAltitude {

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(gain);
    }

    public static int largestAltitude(int[] gain) {
        int currAlt =0;
        int maxAlt =0;

        for(int i : gain){
            currAlt += i;
            maxAlt = currAlt>maxAlt ? currAlt : maxAlt;
        }

        return maxAlt;
    }
}


