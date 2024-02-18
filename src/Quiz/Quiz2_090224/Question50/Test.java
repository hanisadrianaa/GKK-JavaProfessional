package quiz.Quiz2_090224.Question50;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }
}

// list.remove(0): removes element at index 0, returns the removed element (null)
// list.remove(null): attempts to remove element equal to 'null' from the list
// this removal valid and returns 'true'