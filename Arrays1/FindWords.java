import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words){
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> res = new ArrayList();
        boolean flag = true;

        for(String word : words){
            for(String row : rows){
                for(int i=0; i <word.length(); i++){
                    if(row.indexOf(word.toLowerCase().charAt(i)) == -1) {
                        flag = false;
                        break;
                    }
                    flag=true;
                }
                if(flag){
                    res.add(word);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
