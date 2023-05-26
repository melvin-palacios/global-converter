public class toBina {
    public static String ascii_to_bina(String input) {
        StringBuilder output = new StringBuilder();
        String bina = "01";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int j = (int) c;
            output.append(bina.charAt(j / 128));
            output.append(bina.charAt((j % 128) / 64));
            output.append(bina.charAt((j % 64) / 32));
            output.append(bina.charAt((j % 32) / 16));
            output.append(bina.charAt((j % 16) / 8));
            output.append(bina.charAt((j % 8) / 4));
            output.append(bina.charAt((j % 4) / 2));
            output.append(bina.charAt(j % 2));
            output.append(" ");
        }
        return output.toString();
    }
    public static String bina_to_ascii(String input) {
        StringBuilder output = new StringBuilder();
        String bina = "01";
        StringBuilder input2 = new StringBuilder();
        for (int i = 0;i < input.length();i ++) {
            char c = input.charAt(i);
            if (c != ' ') {
                input2.append(c);
            }
        }
        for (int i = 0;i < input2.length();i += 8) {
            char c = input2.charAt(i);
            int j = bina.indexOf(c) * 128;
            c = input2.charAt(i + 1);
            j += bina.indexOf(c) * 64;
            c = input2.charAt(i + 2);
            j += bina.indexOf(c) * 32;
            c = input2.charAt(i + 3);
            j += bina.indexOf(c) * 16;
            c = input2.charAt(i + 4);
            j += bina.indexOf(c) * 8;
            c = input2.charAt(i + 5);
            j += bina.indexOf(c) * 4;
            c = input2.charAt(i + 6);
            j += bina.indexOf(c) * 2;
            c = input2.charAt(i + 7);
            j += bina.indexOf(c);
            output.append((char) j);
        }
        return output.toString();
    }
}
