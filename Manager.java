public class Manager extends Employee{

    String projects;

    public Manager(String name, int id, int salary, String projects) {
        super(name, id, salary);
        this.projects = projects;
    }
    // return the projects which manages by manager
    public String getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", projects='" + projects + '\'' +
                '}';
    }
}
