import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String search_string = in.next();
        System.out.print("Enter a letter to search in the given string: ");
        char target = in.next().trim().charAt(0);
        System.out.println(
                "The character " + target + " is found at the position " + string_search(search_string, target));

    }

    static int string_search(String search, char target) {
        if (search.length() == 0) {
            return -1;
        }
        for (int i = 0; i < search.length(); i++) {

            if (search.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
