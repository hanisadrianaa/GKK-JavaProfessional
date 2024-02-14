package Assignment.Assignment2.Question4;

public class SelectionSort {

    public static int findMinIdx(double[] d, int k) {
        int minIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] < d[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int findMaxIdx(double[] d, int k) {
        int maxIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] > d[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = findMinIdx(arr, i);
            swap(arr, i, minIdx);
        }
    }

    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        double[] arr = { 5.6, 2.3, 8.1, 4.9, 1.2 };
        System.out.print("Before Selection Sort: ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
        selectionSort(arr);
        System.out.print("\nAfter Selection Sort:  ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}
