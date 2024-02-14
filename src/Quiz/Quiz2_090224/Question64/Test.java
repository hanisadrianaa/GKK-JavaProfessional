package Quiz.Quiz2_090224.Question64;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));

        // d1 and d2 use LocalDate.parse(), d1 and d2 are different objects in memory, so d1 == d2 > FALSE
        // d2 and d3 use different methods but represent same date.
        // since d2 and d3 use different methods, they are different object instances. so d2 == d3 > FALSE
        // d3 and d4 use LocalDate.of(), so d3 == d4 > 
        
        // LocalDate.parse(), used for parsing date strings
        // LocalDate.of(), if parameters represent same date, method will return same object instance
    }
}
