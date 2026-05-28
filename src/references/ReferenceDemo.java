package references;

public class ReferenceDemo {
    public static void main(String[] args) {

        EmployeeReferenceDemo e1 = new EmployeeReferenceDemo("Virat", 1);
        EmployeeReferenceDemo e2 = new EmployeeReferenceDemo("Sharma", 2);

        e1.printDetails();
        e2.printDetails();

        e2 = e1;
        e2.printDetails();

        e2.setName("Rahul");
        e2.printDetails();
    }
}