public class Employee {

    private String name;
    private int id;

    public Employee(){
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printDetails() {
        System.out.println(id);
        System.out.println(name);
    }

    public void setName(String name){
        this.name = name;
    }
}
