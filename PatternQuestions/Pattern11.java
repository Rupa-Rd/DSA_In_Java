// Output Pattern
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *
package PatternQuestions;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            int NoOfSpace = n - row;
            for (int space = 1; space <= NoOfSpace; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
