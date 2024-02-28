import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        // Delete elements from Arraylist
        nums.remove(4);
        System.out.println(nums);
        // Delete elements using index
        nums.remove(Integer.valueOf(1));
        System.out.println(nums);
        // Update elements
        nums.set(0, 1);
        System.out.println(nums);

        // Traverse
        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
}
