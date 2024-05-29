import java.util.HashMap;
import java.util.Map;

public class Leave {

    private static final int DEFAULT_LEAVE_BALANCE = 30;
    private Map<Integer, Integer> leaveBalance = new HashMap<>();

    // Method to apply for leave, updating the leave balance if sufficient days are available
    public void applyLeave(Employee employee, int days) {
        int currentBalance = leaveBalance.getOrDefault(employee.getId(), DEFAULT_LEAVE_BALANCE);
        if (currentBalance >= days) {
            leaveBalance.put(employee.getId(), currentBalance - days);
            System.out.println("Leave approved for " + employee.getName() + ". Days remaining: " + (currentBalance - days));
        } else {
            System.out.println("Insufficient leave balance for " + employee.getName());
        }
    }

    // Method to check the remaining leave balance for an employee
    public void checkLeaveBalance(Employee employee) {
        int currentBalance = leaveBalance.getOrDefault(employee.getId(), DEFAULT_LEAVE_BALANCE);
        System.out.println(employee.getName() + " has " + currentBalance + " days of leave remaining.");
    }
}
