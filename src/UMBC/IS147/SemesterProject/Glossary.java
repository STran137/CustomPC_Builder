package UMBC.IS147.SemesterProject;

import java.util.Scanner;

public class Glossary {

    public static void Glossaryinfo() {
        Scanner input = new Scanner(System.in);
        int glossMenu;

        do {System.out.println("This is the PC Building Glossary. Enter a number to select the topic you want to learn more about.");
            System.out.println("[1] Processor (CPU)");
            System.out.println("[2] Motherboard (Mobo)");
            System.out.println("[3] Memory (RAM)");
            System.out.println("[4] Video Card/Graphics Card (GPU)");
            System.out.println("[5] Power Supply (PSU)");
            System.out.println("[6] Quit and return to the main menu");
            glossMenu = input.nextInt();

            switch (glossMenu) {
                case 1:
                    System.out.println("CPU info \n");
                    break;
                case 2:
                    System.out.println("Mobo info \n");
                    break;
                case 3:
                    System.out.println("Ram info \n");
                    break;
                case 4:
                    System.out.println("GPU info \n");
                    break;
                case 5:
                    System.out.println("PSU info \n");
                    break;
                case 6:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Please enter a valid option from the menu. \n");
            }
        } while (glossMenu != 6);
    }
}

