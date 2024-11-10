package org.example.menus;

public class MainMenu extends Menu{
    public void show() {
        int mainChoice;

        while (true) {
            System.out.println("\n> main menu");
            System.out.println("\t[1] apt");
            System.out.println("\t[2] other operations");
            System.out.println("\t[0] close terminal and exit program");

            mainChoice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (mainChoice) {
                case 1:
                    new AptMenu().show();
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
