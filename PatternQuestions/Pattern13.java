// Output Pattern
//     *
//    * *
//   *   *
//  *     *
// *********
package PatternQuestions;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            int NoOfSpace = n - row;
            for (int space = 1; space <= NoOfSpace; space++) {
                System.out.print(" ");
            }
            if (row == n) {
                for (int col1 = 1; col1 <= row; col1++) {
                    System.out.print("*");
                }

            } else {
                System.out.print("*");
            }
            int InbetweenSpace = row != 1 && row != n ? (2 * n - 1) - (2 * NoOfSpace + 2) : 0;
            for (int space = 1; space <= InbetweenSpace; space++) {
                System.out.print(" ");
            }
            if (row == n) {
                for (int col2 = 1; col2 < row; col2++) {
                    System.out.print("*");
                }

            } else if (row != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
