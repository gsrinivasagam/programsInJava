import java.util.*;

public class SearchSuggestionsSystem {
    public static void main(String[] args) {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        System.out.println((suggestedProducts(products, searchWord)));
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Stack<String> stack = new Stack<>();
        List<List<String>> result = new ArrayList<>();
        for (int i = 1; i <= searchWord.length(); i++) {
            String searchWrd = searchWord.substring(0, i);
            for (String prodcut : products) {
                if (prodcut.startsWith(searchWrd)) stack.push(prodcut);
            }
            Collections.sort(stack, Collections.reverseOrder());
            List<String> temp = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                if (!stack.isEmpty()) {
                    temp.add(stack.pop());
                }
            }
            stack.clear();
            result.add(temp);
        }

        return result;
    }


}
