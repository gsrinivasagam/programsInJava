import java.util.*;

public class IntegertoRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }

    public  static String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();

        StringBuilder romNum = new StringBuilder();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");


        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for (int n : list) {
            if (num / n > 0) {
                for (int i = 0; i < (num / n); i++) {
                    romNum.append(map.get(n));
                }
                num = num % n;
            }
        }

        return romNum.toString();
    }
}
