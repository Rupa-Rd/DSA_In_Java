public class CeilingOfTarget {
    public static void main(String[] args) {
        int[] arr = { 23, 25, 34, 55, 67, 77, 89 };
        int target = 90;
        System.out.println("Ceiling of the target " + target + " is " + ceiling(arr, target));
    }

    // Ceiling - Smallest Number which is greater than the target element
    static int ceiling(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;
        // If the target element is greater than all the elements of the array, hence
        // there will be no ceiling element can be found in the array
        if (target > nums[end]) {
            return -1;
        }
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (nums[mid] == target) {
                return mid;

            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return nums[beg];
    }
}
