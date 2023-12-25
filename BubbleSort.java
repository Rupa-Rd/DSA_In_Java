import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 2 };
        // Pass 1: 5,4,3,1,2 -> 4,5,3,1,2 -> 4,3,5,1,2 -> 4,3,1,5,2 -> 4,3,1,2,5
        // Pass 2: 4,3,1,2,5 -> 3,4,1,2,5 -> 3,1,4,2,5 -> 3,1,2,4,5
        // Pass 3: 3,1,2,4,5 -> 1,3,2,4,5 -> 1,2,3,4,5
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped = false;
        // Outer loop for passes
        for (int i = 0; i < arr.length; i++) {
            // Inner loop for comparison till n - 1 items
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // If the array is already sorted then the loop breaks
            if (!swapped) {
                break;
            }
        }
    }
}
