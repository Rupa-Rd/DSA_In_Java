public class SumOfNthRowInPascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        // Pascal Triangle
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // Ans = 1 + 4 + 6 + 4 + 1 = 16
        // Pascal Triangle row sum = 2^ n - 1 since row starts from 0
        // Sum of Pascal triangle (total rows) = 2 ^ n
        System.out.println(1 << (n - 1));
    }
}
