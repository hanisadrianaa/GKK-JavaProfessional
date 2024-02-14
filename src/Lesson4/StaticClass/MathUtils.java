package Lesson4.StaticClass;

// Understanding Static Class
// Static classes in Java are similar to static classes in C#, they cannot be instantiated,
// and they can only contain static members. They are appropriate for utility classes that
// contain methods applicable to a specific domain but don't require instance-specific data.
// Static classes are also useful when you want to group related methods together without the
// need for creating instances of the class.


public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
