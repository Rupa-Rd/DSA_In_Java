import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { -12, 0, -56, 2, 1 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        // Outer loop for passes
        for (int i = 0; i < arr.length; i++) {
            int lastindex = arr.length - i - 1;
            int maxindex = max(arr, 0, lastindex);
            int temp = arr[maxindex];
            arr[maxindex] = arr[lastindex];
            arr[lastindex] = temp;

        }
    }

    static int max(int[] array, int start, int end) {
        int maximum = start;
        for (int i = start; i <= end; i++) {
            if (array[i] > array[maximum]) {
                maximum = i;
            }
        }
        return maximum;
    }
}
