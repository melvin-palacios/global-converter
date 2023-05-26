public class toOcta {
    public static String ascii_to_octa(String input) {
        StringBuilder output = new StringBuilder();
        String octa = "01234567";
        for (int i = 0;i < input.length();i++) {
            int j = input.charAt(i);
            output.append(octa.charAt(j / 64));
            output.append(octa.charAt((j % 64) / 8));
            output.append(octa.charAt(j % 8));
            output.append(" ");
        }
        return output.toString();
    }
    public static String octa_to_ascii(String input) {
        StringBuilder output = new StringBuilder();
        String octa = "01234567";
        StringBuilder input2 = new StringBuilder();
        for (int i = 0;i < input.length();i ++) {
            char c = input.charAt(i);
            if (c != ' ') {
                input2.append(c);
            }
        }
        for (int i = 0;i < input2.length();i += 3) {
            char c = input2.charAt(i);
            int j = octa.indexOf(c) * 64;
            c = input2.charAt(i + 1);
            j += octa.indexOf(c) * 8;
            c = input2.charAt(i + 2);
            j += octa.indexOf(c);
            output.append ((char) j);
        }
        return output.toString();
    }
}
