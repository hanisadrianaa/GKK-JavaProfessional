package Quiz.Quiz1_060224.Question4;

// Question 4. Consider the code of Test.java. What will be the result of compiling
// and executing the code?

public class Test {
    private static void div() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            div();
        } finally {
            System.out.println("FINALLY");
        }
    }
}

// Answer:
// FINALLY is printed to the console, stack trace is printed and then program ends abruptly.