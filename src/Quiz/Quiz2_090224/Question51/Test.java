package Quiz.Quiz2_090224.Question51;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.add(0, "List");

        System.out.println(list);
    }
}

// insert elements using 'add(index, element)' method
// first element in a list has index of 0
// list.add(0, "Array"): inserts "Array" at index 0
// list.add(0, "List"): inserts "List" at index 0, move "Array" to second position