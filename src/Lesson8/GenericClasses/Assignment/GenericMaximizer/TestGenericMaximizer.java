package Lesson8.GenericClasses.Assignment.GenericMaximizer;

import java.util.Arrays;

public class TestGenericMaximizer {
    public static void main(String[] args) {
        Integer[] arrayInInt = {3, 5, 1, 8, 6};  
        Double[] arrayInDouble = {3.2, 5.5, 1.1, 8.7, 6.9}; 

        Integer maxInt = GenericMaximizer.findMaximum(arrayInInt);
        Double maxDouble = GenericMaximizer.findMaximum(arrayInDouble);

        System.out.println(Arrays.toString(arrayInInt));
        System.out.println("Maximum value in Integer array list is: " + maxInt);

        System.out.println(Arrays.toString(arrayInDouble));
        System.out.println("Maximum value in Double array list is: " + maxDouble);
    }
}
