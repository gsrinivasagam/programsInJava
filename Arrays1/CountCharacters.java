public class CountCharacters {
    public static void main(String[] args) {
    String [] words = {"cat","bt","hat","tree"};
    String chars = "atach";
        System.out.println(countCharacters(words,chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int sum =0;
        for(String word : words){
            int[] arr = new int[26];
            boolean flag = true;
            for(char c : chars.toCharArray()){
                arr[c-'a']++;
            }
            for(char c : word.toCharArray()){
                --arr[c-'a'];
                if(arr[c-'a']<0) flag=false;
            }
            if(flag) sum += word.length();
        }

        return sum;
    }
}
