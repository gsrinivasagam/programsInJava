import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWord {
    public static void main(String[] args) {

    }

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> banSet = new HashSet<>(Arrays.asList(banned));
        return Arrays.asList(paragraph.replaceAll("[!?',;.]", " ").toLowerCase().split(" "))
                .stream()
                .filter(word -> !banSet.contains(word) && !(word.trim().equals("")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).get().getKey();
    }
}
