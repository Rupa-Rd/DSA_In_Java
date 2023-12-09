// Output Pattern
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
package PatternQuestions;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int NoOfSpace = n - row;
            for (int space = 1; space <= NoOfSpace; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
