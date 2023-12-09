// Output Pattern
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
package PatternQuestions;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 2 * n; row >= 1; row--) {
            int NoOfCols = row > n ? row - n : n - row + 1;
            int NoOfSpace = n - NoOfCols;
            for (int space = 1; space <= NoOfSpace; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= NoOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
