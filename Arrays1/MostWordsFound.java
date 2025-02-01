public class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {

        int maxWords = 0;
        for (String sent : sentences) {
            String[] words = sent.split(" ");
            if (words.length > maxWords)
                maxWords = words.length;
        }

        return maxWords;
    }
}
