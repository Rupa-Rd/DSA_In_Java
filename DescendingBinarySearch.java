public class DescendingBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 65, 55, 43, 32, 22, 18, 6, 5, 3, 2 };
        int target = 65;
        System.out.println("The target element " + target + " is found at " + search(arr, target));
    }

    static int search(int[] arr, int target) {
        int beg = 0;
        int end = arr.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == target) {
                return mid;

            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }

        }
        return -1;
    }
}
