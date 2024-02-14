package Lesson4.AbstractClass;

// Understanding Abstract Class
// An abstract class in Java cannot be instantiated. It's meant to be extended by subclasses,
// which provide implementations for the abstract methods defined in the abstract class.
// Abstract classes are appropriate when you have a class that serves as a template for other
// classes and provides common behavior or structure that subclasses can inherit and extend.

public abstract class Shape {
    public abstract double calculateArea();
}
