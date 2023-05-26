public class toDeci {
    public static String ascii_to_deci(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0;i < input.length();i++) {
            char c = input.charAt(i);
            output.append((int) c);
            output.append(" ");
        }
        return output.toString();
    }
    public static String deci_to_ascii(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0;i < input.length();i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                i++;
                c = input.charAt(i);
            }
            int j = c - '0';
            i++;
            c = input.charAt(i);
            while (c != ' ') {
                j *= 10;
                j += c - '0';
                i++;
                c = input.charAt(i);
            }
            output.append((char) j);
        }
        return output.toString();
    }
}
