package Lesson8.GenericClasses.Assignment.GenericStack;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<Integer> stack1 = new GenericStack<>(4);
        // push element into stack
        System.out.println("PUSH!\nPUSH!\nPUSH!\nPUSH!");
        stack1.push(55);
        stack1.push(20);
        stack1.push(12);
        stack1.push(67);

        // print stack after push()
        System.out.print("Stack after push(): " + stack1 + "\n");

        // pop element in stack
        System.out.println("POP!");
        stack1.pop();

        // print stack after pop()
        System.out.print("Stack after pop(): " + stack1 + "\n");

        GenericStack<String> stack2 = new GenericStack<>(3);
        // push element into stack
        stack2.push("Java");
        stack2.push("Hello");
        stack2.push("World");

        System.out.print("Stack after push() 3rd element: " + stack2 + "\n");

        // push another element into stack
        System.out.print("Stack after push() 4th element: ");
        stack2.push("Hi");

        // display top element
        System.out.println("Top element of stack1: " + stack1.top());
        System.out.println("Top element of stack2: " + stack2.top());
    }
}
