package Int;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class int5 {
    public static void main(String[] args) {
//        Employee[id,name,age]
        Employee empl1 = new Employee(1,"LMN", 20);
        Employee empl2 = new Employee(2,"ABC", 30);
        Employee empl3 = new Employee(3,"XYZ", 50);
        Employee empl4 = new Employee(4,"ABC", 40);
        List<Employee> list = new ArrayList<>();
        list.add(empl1);
        list.add(empl2);
        list.add(empl3);
        list.add(empl4);

        System.out.println("before --"+list.toString());

        List<Employee> list2 = list.stream().sorted(Comparator.comparing(Employee::getName)).sorted((s1,s2) -> Integer.compare(s1.getAge(),s2.getAge())).collect(Collectors.toList());

        System.out.println("after --"+list2.toString());

//                map(x ->x.name).forEach(System.out::println);



//        Employee[2,"ABC","30]
//        Employee[3,"XYZ",50]
//        Employee[4,"ABC",40]

//        List<Employee> list =
//                output - [{2,"ABC",40}, {4,"ABC",30}, {1,"LMN",20}, {3,"XYZ",50}]
    }
}
