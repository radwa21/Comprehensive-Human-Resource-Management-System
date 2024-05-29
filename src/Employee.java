public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private String department;

    // Constructor to initialize an Employee object
    public Employee(int id, String name, String position, double salary, String department) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    // Getters for the Employee attributes
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    // Override toString method for a readable representation of an Employee object
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
