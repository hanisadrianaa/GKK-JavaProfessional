package Lesson2.Expressions;

public class Exercise2 {
    public static void main(String[] args) {
        boolean p = true;
        boolean q = true;

        if (p && q) {
            q = false;
        } else {
            if (!q) {
                System.out.println(p);
            }
            if (p == q) {
                System.err.println(p || q);
            }
        }
        System.out.println(q);
    }

}
