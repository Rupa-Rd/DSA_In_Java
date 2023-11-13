import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int size = in.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("The array elements are : ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
