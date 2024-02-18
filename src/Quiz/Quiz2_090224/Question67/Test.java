package quiz.Quiz2_090224.Question67;

public class Test {
    public static void main(String[] args) {
        int a = 2;
        boolean res = false;

        res = a++ == 2 || --a == 2 && --a == 2;
        // a = 2;
        // a++ == 2 > true; 'a' is initially 2, TRUE, 'a' is increment to 3
        // --a == 2 > true, 'a' is 3 from previous part, it becomes 2 after decrement, TRUE
        // --a == 2 > false, 'a' decrement by 1, a =1, FALSE

        // logical operator
        // || (OR) evaluates to TRUE if at least one operans is true
        // since 'a++ == 2' is TRUE, overall result will be true
        // 'res' will be true

        System.out.println(a);
    }
}
