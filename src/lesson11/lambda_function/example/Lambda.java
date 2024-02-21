package lesson11.lambda_function.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

    static List<Integer> ary = Arrays.asList(1, 2);
    static List<Integer> ary_filtered;

    static List<Integer> filter() {
        List<Integer> temp = new ArrayList<>();

        ary.forEach((a) -> {
            if(a.equals(1))
                ary_filtered.add(a);
        });

        return temp;
    }

    public static void main(String[] args) {

        // a represent every element in array
        // forEach method: loop over each element of 'ary'
        System.out.print("List of items in array:");
        ary.forEach((a) -> System.out.println(a));

        System.out.println("List of item in filtered array:");
        System.out.println(filter());

        //

        //

        // filter, sort, map, reduce
    }
}
