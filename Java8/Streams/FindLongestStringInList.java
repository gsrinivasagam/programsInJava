package Java8.Streams;

import java.util.Arrays;
import java.util.List;


public class FindLongestStringInList {

    public static void main(String[]args) {


        List<String> names = Arrays.asList("Bond",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
        );

//        String name = names.stream().reduce((x,y) -> x.length()>y.length()?x:y).get();
        String name = names.stream().sorted((x,y) -> x.length()>y.length()?-1:1).findFirst().get();
        System.out.println(name);

    }
}
