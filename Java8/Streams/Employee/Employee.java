package Java8.Streams.Employee;

public class Employee {
    private int empid;
    private String empName;
    private int Salary;

    public Employee(int empid, String empName, int salary, int deptId) {
        this.empid = empid;
        this.empName = empName;
        Salary = salary;
        this.deptId = deptId;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    private int deptId;

}
