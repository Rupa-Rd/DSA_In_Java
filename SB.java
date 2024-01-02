public class SB {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch);
        }
        System.out.println(series);
        System.out.println(series.capacity());
        System.out.println(series.reverse());
    }
}
