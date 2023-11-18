public class FloorOfTarget {
    public static void main(String[] args) {
        int[] arr = { 23, 25, 34, 55, 67, 77, 89 };
        int target = 45;
        System.out.println("Floor element of the target " + target + " is " + Floor(arr, target));
    }

    // Floor - Greatest number smaller than the target element
    static int Floor(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;
        // If target is the least number compared to all the array elements, hence no
        // floor element can be found in the array
        if (target < nums[beg]) {
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
        return nums[end];
    }
}
