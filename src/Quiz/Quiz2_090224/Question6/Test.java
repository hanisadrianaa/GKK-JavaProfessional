package quiz.Quiz2_090224.Question6;

public class Test {
    public static void main(String[] args) {
        m1(null);
    }

    static void m1(CharSequence s) {
        System.out.println("Character");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }
}
