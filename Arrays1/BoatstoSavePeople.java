import java.util.Arrays;

public class BoatstoSavePeople {
    public static void main(String[] args) {
        int[] people = {11, 2, 9, 1, 12, 1, 10, 3};
        int limit = 12;
        BoatstoSavePeople boatstoSavePeople = new BoatstoSavePeople();
        System.out.println(boatstoSavePeople.numRescueBoats(people, limit));
    }

    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length - 1;
        int boat = 0;
        Arrays.sort(people);
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;

            boat++;
        }
        return boat;
    }
}
