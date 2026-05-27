//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Virat", 1);
        Employee e2 = new Employee("Sharma", 2);

        e1.printDetails();
        e2.printDetails();

        e2 = e1;
        e2.printDetails();

        e2.setName("Rahul");
        e2.printDetails();
    }
}