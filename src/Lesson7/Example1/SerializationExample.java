package Lesson7.Example1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 32;
        employee.address = "1234 Main Street";

        try (FileOutputStream fos = new FileOutputStream("employee.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employee);
            System.out.println("Employee object serialized successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String address;
}