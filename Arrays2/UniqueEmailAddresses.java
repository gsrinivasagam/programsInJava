import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(numUniqueEmails(emails));

    }

    public static int numUniqueEmails(String[] emails) {
        Set set = new HashSet();
        for (String s : emails) {
            String a[] = s.split("@");
            String dotRemoved = a[0].replace(".", "");
            int plusIndex = dotRemoved.indexOf('+');
            String trimAfterPlus = dotRemoved;
            if (plusIndex != -1)
                trimAfterPlus = dotRemoved.substring(0, plusIndex);
            set.add(trimAfterPlus + '@' + a[1]);
        }
        return set.size();
    }
}
