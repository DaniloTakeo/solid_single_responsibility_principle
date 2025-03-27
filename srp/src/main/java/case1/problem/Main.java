package case1.problem;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 5000);
        emp.saveToDatabase();
        emp.generateReport();
    }
}
