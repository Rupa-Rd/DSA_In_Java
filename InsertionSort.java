import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        // Outer Loop for passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for sorting the elements of the left array i.e, from arr[i + 1]
            // till arr[0]
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }

            }
        }
    }
}
