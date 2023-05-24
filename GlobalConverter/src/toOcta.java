public class toOcta {
    public static String ascii_to_octa(String input) {
        String output = "";
        String octa = "01234567";
        for (int i = 0;i < input.length();i++) {
            char c = input.charAt(i);
            int j = (int) c;
            output += octa.charAt(j / 64);
            output += octa.charAt((j % 64) / 8);
            output += octa.charAt(j % 8);
            output += " ";
        }
        return output;
    }
    public static String octa_to_ascii(String input) {
        String output = "";
        String octa = "01234567";
        for (int i = 0;i < input.length();i += 3) {
            char c = input.charAt(i);
            int j = octa.indexOf(c) * 64;
            c = input.charAt(i + 1);
            j += octa.indexOf(c) * 8;
            c = input.charAt(i + 2);
            j += octa.indexOf(c);
            output += (char) j;
        }
        return output;
    }
}
