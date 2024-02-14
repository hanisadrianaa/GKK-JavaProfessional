package Assignment.Assignment2.Question3;

public class SeqSearchDemo {
    public static int seqSearch(int[] a, int k) {
        int i = 0;
        int len = a.length;
        while (i < len && a[i] != k) {
            i++;
        }
        if (i >= len) {
            i = -1;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = {99, 105, 86, 34, 108, 25, 11, 96};
        System.out.print("a=");
        printArray(a);

        int target1 = 86;
        int target2 = 96;
        int target3 = 0;

        int result1 = seqSearch(a, target1);
        int result2 = seqSearch(a, target2);
        int result3 = seqSearch(a, target3);

        System.out.println(target1 + " is found at a[" + result1 + "]");
        System.out.println(target2 + " is found at a[" + result2 + "]");
        System.out.println(target3 + " is found at a[" + result3 + "]");
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
