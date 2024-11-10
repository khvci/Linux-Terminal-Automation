package org.example.menus;

import org.example.tools.APT;

import java.util.Scanner;

public class AptMenu extends Menu{
    public static void showAptMenu(Scanner scanner) {
        int aptChoice;

        while (true) {
            System.out.println("\nAPT Operations:");
            System.out.println("[1] Update");
            System.out.println("[2] Other");
            System.out.println("[0] Return to main menu");

            aptChoice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (aptChoice) {
                case 1:
                    APT.update();
                    break;
                case 2:
                    System.out.println("Other APT operation not yet implemented.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }
}
