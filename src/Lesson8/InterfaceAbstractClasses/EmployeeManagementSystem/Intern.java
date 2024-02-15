package Lesson8.InterfaceAbstractClasses.EmployeeManagementSystem;

class Intern extends Employee {

    private double hourlyRate;
    private int workingHours;

    public Intern(String name, int id, double hourlyRate, int workingHours) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        salary = hourlyRate * workingHours;
        return salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
    }
}
