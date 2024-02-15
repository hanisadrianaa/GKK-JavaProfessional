package Lesson8.EmployeeManagementSystem;

public abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("\nName: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: RM" + salary + "");
    }
}
