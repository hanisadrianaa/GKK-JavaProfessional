package Assignment.Assignment1.AssignmentForTheDay;

public class Assignment1 {
    public static void main(String[] args) {
        // Print passed arguments
        System.out.print("Arguments passed: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        // Access variable initialized
        int integerNumber = 10;
        double doubleNumber = 3.14;
        boolean booleanValue = true;
        char charValue = 'A';
        String stringValue = "Hello, World!";

        // Print variables
        System.out.println();
        System.out.println("Integer Data Type: " + integerNumber);
        System.out.println("Double Data Type: " + doubleNumber);
        System.out.println("Boolean Data Type: " + booleanValue);
        System.out.println("Character Data Type: " + charValue);
        System.out.println("String Data Type: " + stringValue);
    }
}