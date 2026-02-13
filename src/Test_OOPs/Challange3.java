package Test_OOPs;

public class Challange3 {
    public static void main(String[] args) {
        //   Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary".
        //   Add getter and setter methods.

        Employee E1 = new Employee(123, "Shraddha",60);
    }
}
class Employee{

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Sal:"+salary);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

