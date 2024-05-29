public class Payroll {

    private static final int DAYS_IN_MONTH = 30;

    // Method to calculate the salary based on the number of days worked
    public double calculateSalary(Employee employee, int daysWorked) {
        double dailyRate = employee.getSalary() / DAYS_IN_MONTH;
        return dailyRate * daysWorked;
    }

    // Method to generate a pay slip for the employee
    public void generatePaySlip(Employee employee, double salary) {
        System.out.println("Pay Slip for " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + salary);
    }
}
