package Lesson8.GenericClasses.Assignment.GenericPair;

public class TestGenericPair {
    public static void main(String[] args) {
        // pair string
        Pair<String, String> stringPair = new Pair<>("Hello", "World");
        System.out.println("String pair: " + stringPair);

        // pair of integer
        Pair<Integer, Double> intDoublePair = new Pair<>(5, 3.14);
        System.out.println("Integer-Double pair: " + intDoublePair);
    }
}
