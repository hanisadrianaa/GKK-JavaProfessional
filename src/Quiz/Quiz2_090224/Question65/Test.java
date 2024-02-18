package quiz.Quiz2_090224.Question65;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1980-03-16");
        System.out.println(date.minusYears(-5));

        // minusYears() to substract -5 years from the parsed date (1980-03-16)
        // -5 years is equal to adding 5 years to the date
        // add 5 years to the date, resulting in 1985-03-16
    }
}
