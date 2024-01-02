import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Roopa Dharshini";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.charAt(12));
        System.out.println(str.indexOf('D'));
        System.out.println(str.strip());
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
