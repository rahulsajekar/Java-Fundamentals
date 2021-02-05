public class Employee {

    String name;
    int id;
    int salary;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, int id, int salary) {
       this(name,id);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
// employee
// name emp id , to string, constructor
// managers
// directors