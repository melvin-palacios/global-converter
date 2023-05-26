import java.util.Scanner;

public class GlobalConverter {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Invalid input");
            while (true) {
                System.out.println("Enter the option (-h, -o, -d, -b), double - for reverse");
                Scanner sc = new Scanner(System.in);
                String input2 = sc.nextLine();
                switch (input2) {
                    case "-h", "--h", "-o", "--o", "-b", "--b", "-d", "--d" -> {
                    }
                    default -> {
                        System.out.println("Invalid option");
                        continue;
                    }
                }
                System.out.println("Enter the input");
                String input3 = sc.nextLine();
                if (input3.length() > 0) {
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
            case "-b" -> System.out.println(toBina.ascii_to_bina(input));
            case "--b" -> System.out.println(toBina.bina_to_ascii(input));
            case "-d" -> System.out.println(toDeci.ascii_to_deci(input));
            case "--d" -> System.out.println(toDeci.deci_to_ascii(input));
            default -> {
                System.out.println("Invalid input");
                while (true) {
                    System.out.println("Enter the option (-h, -o, -d, -b), double - for reverse");
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