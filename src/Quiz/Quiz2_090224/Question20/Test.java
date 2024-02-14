package Quiz.Quiz2_090224.Question20;

public class Test {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // call 'process' method with 'arr', start index 3, end index 8
        String str = process(arr, 3, 8); // Line 5
        System.out.println(str);
    }

    /*INSERT*/

    // Option 1
    // returns a 'String[]' (array of strings)
    // but the process method call expects a String return type
    // private static String [] process(int [] arr, int start, int end) {
    //     return null;
    // }

    // Option 2
    // returns an 'int'
    // but the process method call expects a String return type
    // private static int process(int [] arr, int start, int end) {
    //     return null;
    // }

    // Option 3
    // return type 'String' to match the expected return value
    private static String process(int [] arr, int start, int end) {
        // 'StringBuilder' create processed string
        StringBuilder result = new StringBuilder();

        // repeat through the array element from start to end
        for (int i = start; i < end; i++) {
            // current element at i is access using arr[i]
            // add to 'result'
            result.append(arr[i]);
            if (i < end - 1) {
                // if current element not last one, ' ' is added as separator
                result.append(" ");
            }
        }

        // call toString() on 'result' to convert into regular String
        return result.toString();

        //return null;
    }

    // Option 4
    // returns an 'int[]' (array of integers)
    // but the process method call expects a String return type
    // private static int[] process(int [] arr, int start, int end) {
    //     return null;
    // }
}
