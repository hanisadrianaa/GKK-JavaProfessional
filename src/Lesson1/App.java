package Lesson1;

public class App {
    public static void main (String[] args) {
        System.out.println("Hello, World. " + args[0] + " " + args[1]);
        second();
        SecondClass secondClass = new SecondClass();
        secondClass.second(); //panggil menggunakan nama variable 'secondClass'
        SecondClass.third(); //panggil menggunakan nama class 'SecondClass'
    }

    // method yang tak perlu class, guna 'static'
    public static void second() {
        System.out.println("second");
    }
}

class SecondClass {
    void second(){
        System.out.println("second in a class");
    }

    static void third(){
        System.out.println("third in a class");
    }
}