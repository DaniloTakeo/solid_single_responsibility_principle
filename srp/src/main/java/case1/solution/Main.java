package case1.solution;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("John Doe", 5000);
		EmployeeRepository repository = new EmployeeRepository();
		EmployeeReport report = new EmployeeReport();

		repository.save(emp);
		report.generateReport(emp);
	}
}