package collections;

import java.util.HashSet;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Virat");
        Employee emp2 = new Employee(101, "Virat");

        System.out.println(emp1 == emp2);
        System.out.println(emp1.equals(emp2));

        HashSet<Employee> set = new HashSet<>();

        set.add(emp1);
        set.add(emp2);

        System.out.println(set.size());
    }
}
