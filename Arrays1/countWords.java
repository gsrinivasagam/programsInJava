import java.util.HashMap;
import java.util.Map;

public class countWords {
    public static void main(String[] args) {
        String[]  words1 = {"leetcode","is","amazing","as","is"}, words2 = {"amazing","leetcode","is"};
        System.out.println(countWords(words1,words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        int count =0;
        Map<String,Integer> map = new HashMap();
        for(String word : words1){
            if(map.containsKey(word))
                map.put(word,map.get(word)+1);
            else
                map.put(word,1);
        }

        for(String target : map.keySet()){
            for(String word : words2){
                if(map.get(target)==1 && word == target)
                    count++;
            }
        }

        return count;
    }
}
