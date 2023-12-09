// Output Pattern
//     *****
//     ****
//     ***
//     **
//     *
package PatternQuestions;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
