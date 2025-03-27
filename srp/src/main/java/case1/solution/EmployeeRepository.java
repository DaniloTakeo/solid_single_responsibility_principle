package case1.solution;

public class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving employee: " + employee.getName());
    }
}