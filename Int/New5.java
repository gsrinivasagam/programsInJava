package Int;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//21, 7, 3, 11, 13, 32, 89, 307, 17, 335, 37, 15
public class New5 {
    public static void main(String[] args) {
        int[] arr ={21, 7, 3, 11, 13, 32, 89, 307, 17, 335, 37, 15};
        startsWith3(arr);

        Student s1 = new Student("ganesh","srinivas");
        getStud(s1);

    }

    public static void getStud(Student stud){
        stud = new Student("rames","karthik");

    }

    public static void startsWith3(int[] arr){
        Arrays.sort(arr);
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i = arr.length-1; i >=0; i--) {
            newArr[count++] = arr[i];
        }
//        System.out.println(Arrays.toString(newArr));

        for (int n : newArr) {
            String s = n+ " ";
            if(s.startsWith("3")) System.out.println(s);
//            System.out.println(s.startsWith("3"));
        }

//        List<Integer> list = new ArrayList<>()
    }
}
