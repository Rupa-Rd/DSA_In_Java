import java.util.Scanner;

public class Calculator {
    /**
     * @param args
     */
    public static void main(String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the operator:");
            int op = in.next().trim().charAt(0);
            if (op == 'x' || op == 'X') {
                break;
            } else if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter number 1:");
                int n1 = in.nextInt();
                System.out.print("Enter number 2:");
                int n2 = in.nextInt();
                int ans = 0;

                switch (op) {

                    case '+':
                        ans = n1 + n2;
                        System.out.println(ans);
                        break;
                    case '-':
                        ans = n1 - n2;
                        System.out.println(ans);
                        break;
                    case '*':
                        ans = n1 * n2;
                        System.out.println(ans);
                        break;
                    case '/':
                        ans = n1 / n2;
                        System.out.println(ans);
                        break;
                    case '%':
                        ans = n1 % n2;
                        System.out.println(ans);
                        break;
                    default:
                        break;
                }

            } else {
                System.out.println("Invalid Operator!!");
            }
        }
    }
}
