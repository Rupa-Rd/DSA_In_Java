//Area Of Circle Java Program
package SimpleLogicPrograms;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = in.nextFloat();
        float area = (float) (3.14 * radius * radius);
        System.out.println("Area of the circle : " + area + " sq.units");
    }
}
