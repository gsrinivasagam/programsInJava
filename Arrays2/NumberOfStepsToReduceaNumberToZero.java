public class NumberOfStepsToReduceaNumberToZero {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        return numberOfSteps(num, 0);
    }

    public static int numberOfSteps(int num, int count) {

        if (num == 0)
            return count;

        count++;

        if (num % 2 == 0)
            return numberOfSteps(num / 2, count);
        else
            return numberOfSteps(num - 1, count);
    }
}
