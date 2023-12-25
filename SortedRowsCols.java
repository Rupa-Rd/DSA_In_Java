import java.util.Arrays;

public class SortedRowsCols {
    public static void main(String[] args) {
        // Input
        // [[10,20,30,40],[14,25,32,43],[16,29,34,45],[19,31,39,49]]
        // 34
        // Output
        // [2,2]
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 14, 25, 32, 43 },
                { 16, 29, 34, 45 },
                { 19, 31, 39, 49 }
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] A, int target) {
        int r = 0;
        int c = A.length - 1;
        while (r < A.length && c >= 0) {
            if (A[r][c] == target) {
                return new int[] { r, c };
            }
            if (A[r][c] < target) {
                r += 1;
            } else {
                c -= 1;
            }
        }
        return new int[] { -1, -1 };

    }
}
