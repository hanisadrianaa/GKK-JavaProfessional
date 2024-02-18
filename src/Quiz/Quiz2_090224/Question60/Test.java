package quiz.Quiz2_090224.Question60;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-1-01");
        // LocalDate.parse() method expect a date string in YYYY-MM-DD format
        // 2018-1-01 not follow the format, since month is represent in single digit
        // it will throw DateTimeParseException, meaning parsing failed
        // compiler detect syntax error

        // LocalDate date = LocalDate.parse("2018-01-01");

        System.out.println(date);
    }
}
