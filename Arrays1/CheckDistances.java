public class CheckDistances {
    public static void main(String[] args) {
        String s = "zz";
        int[] distance = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        System.out.println(checkDistances(s,distance));
    }

    public static boolean checkDistances(String s, int[] distance) {
        boolean flag = true;
        int count=0;
        for(char c='a';c<='z';c++){
            int fIndex = s.indexOf(c);
             if(fIndex != -1){
                int sIndex = s.indexOf(c,fIndex+1);
                if(sIndex==-1) {flag = false; break;}
                else{
                    if(((sIndex-fIndex)-1) != distance[count]){
                        flag=false;
                        break;
                    }
                }
            }
             count ++;
        }

        return flag;
    }
}
