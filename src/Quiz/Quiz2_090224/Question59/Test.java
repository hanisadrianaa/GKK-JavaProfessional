package Quiz.Quiz2_090224.Question59;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(formatter.format(date.minus(period)));
    }
}

// runtime exception occurs because mismatch between parsed date format and formatting pattern used for printing
// LocalDate object, 'date' representing January 11, 2012
// Period object, 'period' representing a duration of 2 months
// 'date.minus(period)' will substract period from date
// DateTimeFormatter object, 'formatter' is created with pattern "mm-dd-yy"
// invalid because "mm" represents minutes, "yy" represents years in 2-digit format (00-99), will be a problem for years before 2000
// when execute 'formatter.format(date.minus(period))', will encounter issue because wrong format and year representation
// DateTimeParseException will occur