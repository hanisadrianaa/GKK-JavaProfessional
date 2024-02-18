package quiz.Quiz2_090224.Question46;

class Parent {
    // int i = 10;
    // Parent(int i) {
    //     super();
    //     this.i = i;
    // }

    int i;

    Parent(int i) {
        this.i = i;
    }
}

class Child extends Parent {
    int j = 20;

    Child(int j) {
        super(0);
        this.j = j;
    }

    Child(int i, int j) {
        // super(i);
        // this(j);

        super(i);
        this.j = j;
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child(1000, 2000);
        System.out.println(child.i + ":" + child.j);
    }
}

// constructor 'Child(int i, int j)'' is trying to call another constructor 'this(j)'' using this keyword
// it's not allowed to call constructor within another constructor using 'this' keyword
// supposed to use 'this()' to call another constructor within same class or 'super()' to call constructor in parent class