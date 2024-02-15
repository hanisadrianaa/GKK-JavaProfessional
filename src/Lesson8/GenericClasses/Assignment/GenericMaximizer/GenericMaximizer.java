package Lesson8.GenericClasses.Assignment.GenericMaximizer;

public class GenericMaximizer<T> {
    
    public static <T extends Comparable<T>> T findMaximum(T[] array) {
        T max = array[0];  
        for (int i = 1; i < array.length; i++) {  
            if (array[i].compareTo(max) > 0) {  
                max = array[i];  
            }  
        }  
        return max;
    }    
}
