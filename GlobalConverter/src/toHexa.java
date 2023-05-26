public class toHexa {
    public static String ascii_to_hexa(String input) {
        StringBuilder output = new StringBuilder();
        String hexa = "0123456789ABCDEF";
        for (int i = 0;i < input.length();i++) {
            char c = input.charAt(i);
            output.append(hexa.charAt((int) c / 16));
            output.append(hexa.charAt((int) c % 16));
            output.append(" ");
        }
        return output.toString();
    }
    public static String hexa_to_ascii(String input) {
        StringBuilder output = new StringBuilder();
        StringBuilder input2 = new StringBuilder();
        String hexa = "0123456789ABCDEF";
        for (int i = 0;i < input.length();i ++) {
            char c = input.charAt(i);
            if (c != ' ') {
                input2.append(c);
            }
        }
        for (int i = 0;i < input2.length();i += 2) {
            char c = input2.charAt(i);
            if (c == ' ') {
                i++;
                c = input2.charAt(i);
            }
            int j = hexa.indexOf(c) * 16;
            c = input2.charAt(i + 1);
            j += hexa.indexOf(c);
            output.append((char) j);
        }
        return output.toString();
    }
}
