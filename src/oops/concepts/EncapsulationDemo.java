package oops.concepts;

import oops.concepts.encapsulation.Employee;

public class EncapsulationDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Virat", 130000);
        Employee emp2 = new Employee("Rahul", 120000);

        System.out.println(emp1.getName());
        System.out.println(emp2.getSalary());

        emp2.setSalary(-30000);
        System.out.println(emp2.getSalary());
    }
}