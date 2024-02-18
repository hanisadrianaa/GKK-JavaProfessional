package quiz.Quiz2_090224.Question34;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11")); // July 11, 2018
        // Runtime exception - DateTimeParseException
        // LocalDate.parse() format: "YYYY-MM-DD" (year-month-day)

        dates.add(LocalDate.parse("1919-10-11")); // October 11, 1919
        dates.add(LocalDate.of(2020, 4, 8)); // April 8, 2020
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31)); // December 31, 1980

        // using lambda expression
        dates.removeIf(x -> x.getYear() < 2000);
        
        System.out.println(dates);
    }
}