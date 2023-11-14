import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the Target element: ");
        int target = in.nextInt();

        System.out.println("The target element " + target + " is found at the position " + linear_search(arr, target));

    }

    static int linear_search(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int j = 0; j < array.length; j++) {
            int element = array[j];
            if (element == target) {
                return j;
            }
        }
        return -1;
    }
}
