import java.util.HashMap;
import java.util.Map;

public class Performance {

    private Map<Integer, String> performanceReviews = new HashMap<>();

    // Method to add a performance review for an employee
    public void addPerformanceReview(Employee employee, String review) {
        performanceReviews.put(employee.getId(), review);
        System.out.println("Performance review added for " + employee.getName());
    }

    // Method to get the performance review of an employee
    public void getPerformanceReview(Employee employee) {
        String review = performanceReviews.get(employee.getId());
        if (review != null) {
            System.out.println("Performance review for " + employee.getName() + ": " + review);
        } else {
            System.out.println("No performance review found for " + employee.getName());
        }
    }
}
