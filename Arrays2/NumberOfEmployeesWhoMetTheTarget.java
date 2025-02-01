public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        int[] hours = {0, 1, 2, 3, 4};
        System.out.println(numberOfEmployeesWhoMetTarget(hours, 2));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int n : hours) {
            if (n >= target)
                count++;
        }
        return count;
    }
}
