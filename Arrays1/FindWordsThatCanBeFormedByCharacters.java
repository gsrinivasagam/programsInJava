public class FindWordsThatCanBeFormedByCharacters {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words,chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int sum =0;
        boolean flag =true;
        int[] arr = new int[26];

        // for(String word : words){
        //     for(int i=0;i<word.length();i++){
        //         if(chars.indexOf(word.toCharArray()[i])==-1) flag = false;
        //     }
        for(char c : chars.toCharArray()){
            arr[c-'a']++;
        }

        for(String word :words){
            for(char c : word.toCharArray()){
                if(--arr[c-'a']<0) flag =false;
            }

            if(flag) {sum += word.length();}
            flag =true;
        }

        return sum;
    }
}
