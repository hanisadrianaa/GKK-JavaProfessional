package Lesson4.POJOClass;

// Understanding POJO Class
// A POJO (Plain Old Java Object) class in Java is a simple Java class that only contains private fields,
// along with public getter and setter methods to access and modify those fields. POJO classes are used
// to represent data objects in the application. They are appropriate when you need to model data with
// attributes but do not require any specific functionality or behavior beyond accessing and modifying
// those attributes.
// the entire application, such as logging, configuration settings, database connections, etc.

public class Person {

    private String name;
    private int age;
    private String email;

    // Public constructor to initialize fields
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
