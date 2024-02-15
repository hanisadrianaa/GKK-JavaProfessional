package Lesson8.GenericClasses.Assignment.GenericStack;

import java.util.ArrayList;

public class GenericStack<T> {
    ArrayList<T> array; // empty array
    int top = -1; // default top when stack empty
    int size; // store size array

    public GenericStack(int size) {
        this.size = size; // store value of size
        this.array = new ArrayList<T>(size); // create array Size = size
    }

    // pust element in stack
    void push(T X) {
        if (top + 1 == size) { // check stack full or not
            System.out.println("Stack overflow.");
        } else {
            top = top + 1;
            if (array.size() > top) {
                array.set(top, X);
            } else {
                array.add(X);
            }
        }
    }

    // return to top element of stack
    T top() {
        if (top == -1) { // check if stack empty
            System.out.println("Stack underflow");
            return null;
        } else {
            return array.get(top);
        }
    }

    // delete last element in stack
    void pop() {
        if (top == -1) { // check if stack empty
            System.out.println("Stack underflow.");
        } else {
            top--;
        }
    }

    // check stack empty or not
    boolean isEmpty() {
        return top == -1;
    }

    // print stack
    public String toString() {
        String print = "";

        for(int i = 0; i < top; i++) {
            print += String.valueOf(array.get(i)) + " > ";
        }

        print += String.valueOf(array.get(top));
        return print;
    }
}
