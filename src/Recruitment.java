import java.util.ArrayList;
import java.util.List;

public class Recruitment {

    private List<Employee> candidates = new ArrayList<>();

    // Method to add a candidate to the list
    public void addCandidate(Employee employee) {
        candidates.add(employee);
        System.out.println(employee.getName() + " added to candidates list.");
    }

    // Method to hire a candidate from the list
    public void hireCandidate(Employee employee) {
        if (candidates.remove(employee)) {
            System.out.println(employee.getName() + " has been hired.");
        } else {
            System.out.println(employee.getName() + " is not in the candidates list.");
        }
    }

    // Method to list all candidates
    public void listCandidates() {
        System.out.println("List of candidates:");
        for (Employee candidate : candidates) {
            System.out.println(candidate);
        }
    }
}
