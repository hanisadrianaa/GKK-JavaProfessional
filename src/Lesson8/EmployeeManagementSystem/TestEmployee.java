package Lesson8.EmployeeManagementSystem;

public class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("Hanis", 123, 6000, 1000);
        Developer developer = new Developer("Adriana", 456, 50, 40);
        Intern intern = new Intern("Azizan", 456, 50, 15);

        manager.calculateSalary();
        developer.calculateSalary();
        intern.calculateSalary();

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
