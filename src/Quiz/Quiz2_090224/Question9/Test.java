package quiz.Quiz2_090224.Question9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(new Integer(10));

        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        Integer i1 = cloned.get(0);
        ++i1;

        System.out.println(cloned);
    }
}
