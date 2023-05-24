public class toHexa {
    public static String ascii_to_hexa(String input) {
        String output = "";
        String hexa = "0123456789ABCDEF";
        for (int i = 0;i < input.length();i++) {
            char c = input.charAt(i);
            int j = (int) c;
            output += hexa.charAt(j / 16);
            output += hexa.charAt(j % 16);
            output += " ";
        }
        return output;
    }
    public static String hexa_to_ascii(String input) {
        String output = "";
        String hexa = "0123456789ABCDEF";
        for (int i = 0;i < input.length();i += 2) {
            char c = input.charAt(i);
            if (c == ' ') {
                i++;
                c = input.charAt(i);
            }
            int j = hexa.indexOf(c) * 16;
            c = input.charAt(i + 1);
            j += hexa.indexOf(c);
            output += (char) j;
        }
        return output;
    }
}
