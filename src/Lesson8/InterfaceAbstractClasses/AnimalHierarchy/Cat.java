package Lesson8.InterfaceAbstractClasses.AnimalHierarchy;

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
}
