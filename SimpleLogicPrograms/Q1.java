// Areas
/*1. Circle - pi*r*r 
 * 2. Triangle - 0.5*base*height
 * 3. Rectangle - length * breadth
 * 4. Isosceles - 0.5*base*height
 * 5. Parallelogram - base * height
 * 6. Rhombus - 0.5 * diagonal1 * diagonal2
 * 7. Equilateral Triangle - sqrt(3) / 4 * side * side
 */
package SimpleLogicPrograms;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    static void CircleArea() {
        System.out.print("Enter the radius: ");

        float area = (float) (3.14 * radius * radius);
        System.out.println("Area of the circle : " + area + " sq.units");
    }

    static void TriangleArea(){
        System.out.print("Enter the Base: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height: ");
     

        float area = (float) 0. 5 * base * height;
        System.out.println("Area of a triangle:" + area);
    }

    static void RectangleArea() {
        System.out.print("Enter the length: ");
        float length = in.nextFloat();
        System.out.print("Enter the Breadth: ");

        float area = (float) length * breadth;
        System.out.println("Area of a Rectangle:" + area);
    }

    static void ParallelogramArea(){
        System.out.print("Enter the Base: ");
        float base = in.nextFloat();
        System.out.print("Enter the Height: ");
     

        float area = base * h eight;
        System.out.println("Area of a Parallelogram:" + area);
    }

    static void RhombusArea(){
        System.out.print("Enter the Diagonal1: ");
        float diagonal1 = in.nextFloat();
        System.out.print("Enter the Diagonal2: ");
     

        float area = (float) 0.5 * diagon al1 * diagonal2;
        System.out.println("Area of a triangle:" + area);
    }

    System.out.print("Enter the Side: ");

    float side = in.nextFloat();

    System.out.println("Area of a triangle:"+area);
}

}
