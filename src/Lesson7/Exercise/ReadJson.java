package Lesson7.Exercise;

public class ReadJson {
    private String mockJson = "{\"name\": \"Hanis\", \"age\": 26}";

    private static class Person {
        String name;
        int age;
    }

    public void mapToObject() {
        // Simulate the parsing and mapping process
        Person person = new Person();
        person.name = "Hanis";
        person.age = 26;

        System.out.println("Mapped object: " + person.toString());
    }
}
