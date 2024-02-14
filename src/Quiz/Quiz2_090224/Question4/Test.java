package Quiz.Quiz2_090224.Question4;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String[] arr = { "A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        // processStringArray(arr, p -> p.length() >= 1);

        // processStringArray(arr, p -> p.length() < 10);

        processStringArray(arr, p -> true);

        //processStringArray(arr, p -> !false);
    }

    private static void processStringArray(String[] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
