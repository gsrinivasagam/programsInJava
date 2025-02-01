public class GarbageCollection {
    public static void main(String[] args) {
        String garbage[] = {"G","P","GP","GG"};
        int[] travel = {2,4,3};
        System.out.println(garbageCollection(garbage,travel));
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int res = 0;

        for (String g : garbage) {
            res += g.length();
        }

        boolean m = false, p = false, g = false;

        for (int i = travel.length; i > 0; i--) {
            m = m || garbage[i].contains("M");
            p = p || garbage[i].contains("P");
            g = g || garbage[i].contains("G");

            res += travel[i-1] * ((m ? 1 : 0) + (p ? 1 : 0) + (g ? 1 : 0));
        }

        return res;
    }
}
