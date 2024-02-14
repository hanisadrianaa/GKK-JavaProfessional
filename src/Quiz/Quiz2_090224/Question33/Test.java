package Quiz.Quiz2_090224.Question33;

import java.util.ArrayList;
import java.util.List;

public class Test {

    // List list1 = new ArrayList<String>(); // Line 5
    // List<String> list1 = new ArrayList<>();
    // declares a raw type List, meaning it does not specify the type parameter

    // List<String> list2 = new ArrayList(); // Line 6
    // List<String> list2 = new ArrayList<>();
    // declares a generic type List parameterized with String, but it initializes it with a raw ArrayList

    // List<> list3 = new ArrayList<String>(); // Line 7
    // List<String> list3 = new ArrayList<>();
    // declare a variable list3 of type List without specifying the type parameter

    List<String> list4 = new ArrayList<String>(); // Line 8
    // declares a variable list4 of type List parameterized with String
    // initializes it with a new ArrayList<String>()
    
    List<String> list5 = new ArrayList<>(); // Line 9
    // similar to Line 8 but uses the diamond operator (<>) for type inference
}
