package quiz.quiz3_200224;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q16_Test {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("where");
        words.add("whether");

        // !!!!true breakdown:  1. !true evaluates to false.
                             // 2. !!false evaluates to true.
                             // 3. !!!true evaluates to false.
                             // 4. !!!!true evaluates to true.

        processStringArray(words, p -> !!!!true);
        // Output:
        // A
        // an
        // the
        // when
        // what
        // where
        // whether

        // processStringArray(words, /*INSERT*/);

        // processStringArray(words, /*INSERT*/);

        // processStringArray(words, /*INSERT*/);

        // processStringArray(words, /*INSERT*/);

        // processStringArray(words, /*INSERT*/);

        // processStringArray(words, /*INSERT*/);
    }

    private static void processStringArray(List<String> list, Predicate<String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}

// 16. Given code of Test.java file,Which of the following options can replace
// /*INSERT*/ such that on executing Test class all the list elements are
// displayed in the output?
// Select 4 options.

// ✓ p -> !!!!true
// p -> p.length() < 7
// ✓ p -> p.length() >= 1
// String p -> p.length() > 0
// p -> !!false
// ✓ p -> true
// ✓ (String p) -> p.length() < 100