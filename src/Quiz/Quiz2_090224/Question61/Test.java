package Quiz.Quiz2_090224.Question61;

public class Test {
    private static boolean flag = !true;
    public static void main(String[] args) {
        System.out.println(!flag ? args[0] : args[1]);
    }

    // flag = !true > FALSE
    // !flag ? args[0] : args[1]
        // !flag, since flag is FALSE, !flag becomes TRUE
        // if !flag is TRUE, it prints args[0], which is AM
        // if !flag is FALSE, it prints args[1], which is PM
    // code prints AM to the console, because !flag is TRUE
}
