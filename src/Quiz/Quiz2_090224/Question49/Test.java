package Quiz.Quiz2_090224.Question49;

public class Test {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1};

        // for(int i = 0; i < arr.length; i++) {
        for(int i : arr) {
            System.out.println(arr[i]);
        }
    }
}

// for(int i : arr)
// 'i' iterates over indices of array 'arr', not the value
// 'arr' has indices from 0 to 2, representing elements
// when 'i' becomes 3, it try to access arr[3] which is outside bounds of array, which resulting to exception