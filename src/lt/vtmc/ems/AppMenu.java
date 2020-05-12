package lt.vtmc.ems;

import java.util.Scanner;

public class AppMenu {
    private char exit;
    private Scanner input = new Scanner(System.in);

    public void mainMenu() throws Exception {
        // TODO
        while (exit != 'y') {
            System.out.println("Simple Java calculator ver. 1.0");
            arithmeticCalculateMenu();
            exitMenu();
        }
    }

    private void arithmeticCalculateMenu() throws Exception {
        // TODO
        String skaicius = "Iveskite skaiciu: ";
        String operator = "Operacija: ";

        System.out.print(skaicius);
        double x = Integer.parseInt(input.next());
        System.out.print(skaicius);
        double y = Integer.parseInt(input.next());
        System.out.print(operator);
        String op = input.next();

        double z = 0;

        if (op.equals("+")) {
            z = x + y;
        } else if (op.equals("-")) {
            z = x - y;
        } else if (op.equals("*")) {
            z = x * y;
        } else if (op.equals("/")) {
            z = x / y;
        } else {
            throw new Exception("Operator not recognized");
        }
        System.out.println("Result: " + z);
    }

    private void exitMenu() {
        // TODO

        System.out.println("Continue (y/n): ");
        String read = input.next().toLowerCase();
        char close = read.charAt(0);
        switch (close) {
            case 'y':
                exit = 'n';
                break;
            case 'n':
                exit = 'y';

                System.out.println("Good luck!");
                break;
            default:
                System.out.println("Wrong symbol!");
                exit = 'n';
        }
    }
}
