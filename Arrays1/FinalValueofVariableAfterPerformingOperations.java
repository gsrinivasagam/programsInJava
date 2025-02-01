public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String oper : operations) {
            if (oper.contains("+"))
                count++;
            else
                count--;
        }
        return count;
    }
}
