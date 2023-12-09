package PatternQuestions;

public class Pattern15 {
    public static void main(String[] args) {
        int original = 5;
        int n = 2 * original - 1;
        for (int row = 1; row <= n; row++) {
            int NoOfSpace = n - row;
            for (int space = 1; space <= NoOfSpace; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int InbetweenSpace = row <= n ? (n - 1) - (2 * NoOfSpace + 2) : row;
            for (int space = 1; space <= InbetweenSpace; space++) {
                System.out.print(" ");
            }
            if (row != 1 || row != n) {
                System.out.print("*");
            } else {
                break;
            }

            System.out.println();
        }
    }
}
