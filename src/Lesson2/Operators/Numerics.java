package Lesson2.Operators;

public class Numerics {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 32.19;
        
        // cast integer value to double
        double castedDoubleValue = (double) intValue;
        System.out.printf("Casted value from int to double %f", castedDoubleValue);

        // cast double value to int
        // lost in precision, from double (32.19) to int (32)
        int castedIntValue = (int) doubleValue;
        System.out.printf("\nCasted value from double to int %d", castedIntValue);
    }
}