import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 5 };
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr) {
        // Outer loop is for passes
        int i = 0;
        while (i < arr.length) {
            // Check whether the element at ith position is already placed at its correct
            // position
            int CorrectIndex = arr[i] - 1;
            if (arr[i] != arr[CorrectIndex]) {
                swap(arr, i, CorrectIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int PrePos, int CurPos) {
        int temp = arr[PrePos];
        arr[PrePos] = arr[CurPos];
        arr[CurPos] = temp;
    }
}
