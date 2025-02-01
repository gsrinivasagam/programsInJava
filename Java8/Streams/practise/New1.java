package Java8.Streams.practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class New1 {
    public static void main(String[] args) {


//        Employee e1 = new Employee(1, "		Rajesh", 50000, 1);
//        Employee e2 = new Employee(2, "		Gupta", 30000, 1);
//        Employee e3 = new Employee(3, "		Narendra", 45000, 1);
//        Employee e4 = new Employee(4, "		Tikesh", 54000, 1);
//        Employee e5 = new Employee(5, "		Keshv", 65000, 1);
        List<Employee> list = Arrays.asList(new Employee(1, "		Rajesh", 40000, 1)
         ,new Employee(2, "		Gupta", 50000, 1)
        ,new Employee(3, "		Narendra", 30000, 2)
        ,new Employee(4, "		Tikesh", 45000, 2)
        ,new Employee(5, "		Keshv", 20000, 1));

        System.out.println(list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get().getEmpName());
        System.out.println(list.stream().map(Employee::getSalary).distinct().collect(Collectors.toList()));

        List<Employee> listEmp = list.stream().sorted(Comparator.comparing(Employee::getDeptId).thenComparing(Employee::getSalary)).collect(Collectors.toList());

        listEmp.forEach(s -> System.out.println(s.getEmpName()));
    }

}
