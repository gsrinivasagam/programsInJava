import java.util.*;

public class SearchSuggestionsSystemWithPQ {
    public static void main(String[] args) {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        System.out.println((suggestedProducts(products, searchWord)));
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {

        PriorityQueue<String> pq = new PriorityQueue<>((s1,s2) -> s1.compareTo(s2));
        List<List<String>> result = new ArrayList<>();

        for (int i = 1; i <= searchWord.length(); i++) {
            String searchWrd = searchWord.substring(0, i);
            for (String product : products) {
                if (product.startsWith(searchWrd)) pq.add(product);
            }

//            Collections.sort(pq, Collections.reverseOrder());
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                if (!pq.isEmpty()) temp.add(pq.poll());
            }

            pq.clear();
            result.add(temp);
        }

        return result;
    }


}
