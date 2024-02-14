package Lesson4.POJOClass;

public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30, "john@example.com");

        // Display person details
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());
    }
}