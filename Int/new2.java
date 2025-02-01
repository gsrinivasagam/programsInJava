package Int;
//[4:57 PM] Ravikumar Siraparapu
//        String str="ABC12D0E34F04";
//        can you sum all numbers
//        o/p : 50
public class new2 {
    public static void main(String[] args) {
        String str="ABC12D0E34F04";
//        char[] c =
        int sum=0;
        int tSum =0;
        for(char c : str.toCharArray()){
            if(c-'A'<0){
                sum = c+ tSum*10;
                tSum = tSum + tSum*10;
            }else{
                tSum =0;
            }
        }

        System.out.println( sum);
    }
}
