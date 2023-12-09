// Output Pattern
//         *
//        ***
//       *****
//      *******
//     *********

package PatternQuestions;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            int NoOfSpace = n - row;
            for (int space = 1; space <= NoOfSpace; space++) {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= row; col1++) {
                System.out.print("*");
            }
            for (int col2 = row - 1; col2 >= 1; col2--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
