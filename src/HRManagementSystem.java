import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HRManagementSystem {

    private List<Employee> employees = new ArrayList<>();
    private Payroll payroll = new Payroll();
    private Leave leave = new Leave();
    private Performance performance = new Performance();
    private Recruitment recruitment = new Recruitment();

    // Method to add an employee to the system
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " added to employees list.");
    }

    // Method to list all employees
    public void listEmployees() {
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Method to find an employee by ID
    public Optional<Employee> findEmployeeById(int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst();
    }

    // Main method to run the HR Management System
    public static void main(String[] args) {
        HRManagementSystem system = new HRManagementSystem();

        // Create and add employees
        Employee emp1 = new Employee(1, "John Doe", "Developer", 5000, "IT");
        Employee emp2 = new Employee(2, "Jane Smith", "Manager", 7000, "HR");

        system.addEmployee(emp1);
        system.addEmployee(emp2);

        // List all employees
        system.listEmployees();

        // Generate pay slip for an employee
        double salary = system.payroll.calculateSalary(emp1, 20);
        system.payroll.generatePaySlip(emp1, salary);

        // Apply and check leave for an employee
        system.leave.applyLeave(emp1, 5);
        system.leave.checkLeaveBalance(emp1);

        // Add and get performance review for an employee
        system.performance.addPerformanceReview(emp1, "Excellent work throughout the year.");
        system.performance.getPerformanceReview(emp1);

        // Add and list candidates
        Employee candidate = new Employee(3, "Michael Johnson", "Designer", 4000, "Design");
        system.recruitment.addCandidate(candidate);
        system.recruitment.listCandidates();
    }
}
