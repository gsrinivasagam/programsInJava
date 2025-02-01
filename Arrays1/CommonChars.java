import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonChars {
    public static void main(String[] args) {
    String[]  words = {"bbddabab","cbcddbdd","bbcadcab","dabcacad","cddcacbc","ccbdbcba","cbddaccc","accdcdbb"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        boolean flag = true;
        List<String> res = new ArrayList();
        Map<Character,Integer> map = new HashMap();
        for(String str : words){
            for(int i=0;i<str.length();i++){
                char t = str.charAt(i);
                if(map.containsKey(t))
                    map.put(str.charAt(i),(map.get(t)+1));
                else
                    map.put(str.charAt(i),1);
            }
        }

        for(char k : map.keySet()){
            flag = true;
            boolean secondflag = true;

            if(map.get(k)>= words.length*2){
                for(String s : words){
                    int fIndex = s.indexOf(k);
                    if(fIndex != -1)
                    {
                        if(s.indexOf(k,fIndex + 1) == -1)
                            secondflag = false;
                    }
                    if(fIndex==-1) flag =false;
                }
                if(secondflag){
                    res.add(Character.toString(k));
                    res.add(Character.toString(k));
                }else if(flag){
                    res.add(Character.toString(k));
                }
            }else if(map.get(k)>= words.length){
                for(String s : words){
                    if(s.indexOf(k) == -1) flag = false;
                }
                if(flag){
                    res.add(Character.toString(k));
                }
            }

        }

//        for(char k : map.keySet()){
//            if(map.get(k)>= words.length*2){
//                res.add(Character.toString(k));
//                res.add(Character.toString(k));
//            }
//            else if(map.get(k) >= words.length)
//                res.add(Character.toString(k));
//        }

        return res;
    }
}
