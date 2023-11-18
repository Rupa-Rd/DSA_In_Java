public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 90, 88, 76, 54, 23, 11, 3, 2, 1 };
        int target = 34;
        int start = arr[0];
        int end = arr[arr.length - 1];
        int index = -1;
        if (start < end) {
            index = AscendingOrder(arr, target);
        } else {
            index = DescendingOrder(arr, target);
        }
        System.out.println("The target element is " + target + " found at " + index);
    }

    static int AscendingOrder(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (target < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    static int DescendingOrder(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (target < array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
