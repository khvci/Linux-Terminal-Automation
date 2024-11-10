package org.example.menus;

import static org.example.menus.AptMenu.showAptMenu;

public class MainMenu extends Menu{
    public static void show() {
//        Scanner scanner = new Scanner(System.in);
        int mainChoice;

        while (true) {
            System.out.println("Select what you need:");
            System.out.println("[1] apt");
            System.out.println("[2] other operations");
            System.out.println("[0] close terminal and exit program");

            mainChoice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (mainChoice) {
                case 1:
                    showAptMenu(scanner);
                    break;
                case 2:
                    System.out.println("Other operations not yet implemented.");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }
}
