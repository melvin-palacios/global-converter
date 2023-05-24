import java.util.Scanner;

public class GlobalConverter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid input");
            while (true) {
                System.out.println("Enter the option (-h, -o, -d, -b)");
                Scanner sc = new Scanner(System.in);
                String input2 = sc.nextLine();
                System.out.println("Enter the input");
                String input3 = sc.nextLine();
                if (input2.length() > 0 && input3.length() > 0 ) {
                    GlobalConverter.main(new String[] {input2, input3});
                    break;
                }
            }
            return;
        }
        String input = args[1];
        switch (args[0]) {
            case "-h" -> System.out.println(toHexa.ascii_to_hexa(input));
            case "--h" -> System.out.println(toHexa.hexa_to_ascii(input));
            case "-o" -> System.out.println(toOcta.ascii_to_octa(input));
            case "--o" -> System.out.println(toOcta.octa_to_ascii(input));
            default -> {
                System.out.println("Invalid input");
                while (true) {
                    System.out.println("Enter the option (-h, -o, -d, -b)");
                    Scanner sc = new Scanner(System.in);
                    String input2 = sc.nextLine();
                    System.out.println("Enter the input");
                    String input3 = sc.nextLine();
                    if (input2.length() > 0 && input3.length() > 0 ) {
                        GlobalConverter.main(new String[] {input2, input3});
                        break;
                    }
                }
            }
        }

    }
}