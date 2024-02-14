package Quiz.Quiz2_090224.Question21;

public class Test {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    // method overloading
    // use different method names
    // private static void add(Double d1, double d2) {
    //     System.out.println("Double version: " + (d1 + d2));
    // }

    public static void main(String[] args) {
        //add(10.0, null);

        // replace 'null' with a valid 'double' value in 'add' method call
        add(10.0, 5.3);
    }
}
