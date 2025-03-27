package case1.problem;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void saveToDatabase() {
        System.out.println("Saving employee: " + name);
    }

    public void generateReport() {
        System.out.println("Generating report for: " + name);
    }
}