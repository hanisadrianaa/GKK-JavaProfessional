package quiz.Quiz2_090224.Question48;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

        // if(list.remove(2)) {
        //     list.remove("THREE");
        // }

        // Remove by index
        // if (list.remove(2)) { 
        //     System.out.println("Removed element at index 2: " + list);
        // } else {
        //     System.out.println("No element at index 2 to remove");
        // }

        // Remove by value
        if (list.remove("THREE")) {
            System.out.println("Removed first \"THREE\": " + list);
        } else {
            System.out.println("No element \"THREE\" found to remove");
        }

        System.out.println(list);
    }
}

// remove(2) method within if condition using int argument(index) while expecting String object (an element)
