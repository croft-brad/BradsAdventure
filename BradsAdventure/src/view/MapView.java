/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Brad Croft me@bradcroft.com
 */
class MapView {

    private final String MENU = "\n"
            + "The map is in a grid of a 3 x 3 square."
            + "\n\tA\tB\tC"
            + "\n\tD\tE\tF"
            + "\n\tG\tH\tI"
            + "\n Enter \"X\" to exit the map";

    void displayMenu() {
        //   System.out.println(MENU);
        char selection = ' ';
        do {

            System.out.println(MENU);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        } while (selection != 'X');
    }

    public String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter your map choice.");
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Invalid Map - The name must not be blank");
                continue;
            }
            break;
        }
        return input;
    }

  
//        private void doAction(char selection) {
    public void doAction(char value) {
        switch (value) {
            case 'A':
                this.MapAView();
                break;
            case 'B':
                this.MapBView();
                break;
            case 'C':
                this.MapCView();
                break;
            case 'D':
                this.MapDView();
                break;
            case 'E':
                this.MapEView();
                break;
            case 'F':
                this.MapFView();
                break;
            case 'G':
                this.MapGView();
                break;
            case 'H':
                this.MapHView();
                break;
            case 'I':
                this.MapIView();
                break;
            case 'X':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    // Map Locations
    private void MapAView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("A"); // Even Room
        System.out.println("In this room you found: ");
        //      System.out.println(RoomObject.Icee.values()[1]);
        // Add the char of object symbol        System.out.println(RoomObject.getObjectSymbol());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    private void MapBView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("B"); // Odd room
        System.out.println("In this room you found: ");
        //     System.out.println(RoomObject.Hottron.values()[1]);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    private void MapCView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("C"); // Even Room
        System.out.println("In this room you found: ");
        //      System.out.println(RoomObject.Chest4.values()[1]);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    private void MapDView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("D");  // Odd room
        System.out.println("In this room you found: ");
        //     System.out.println(RoomObject.Puzzle1.values()[1]);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    private void MapEView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("E"); // Even Room
        System.out.println("In this room you found: ");
        //     System.out.println(RoomObject.FlameBoy.values()[1]);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    private void MapFView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("F"); // Even Room
        System.out.println("In this room you found: ");
        //     System.out.println(RoomObject.Acidface.values()[1]);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    private void MapGView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("G"); // Odd room
        System.out.println("In this room you found: ");
        //     System.out.println(RoomObject.Chest8.values()[1]);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    private void MapHView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("H"); // Even Room
        System.out.println("In this room you found: ");
        //     System.out.println(RoomObject.Puzzle7.values()[1]);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    private void MapIView() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Map ");
        System.out.println("I"); // Odd room
        System.out.println("In this room you found: ");
        //      System.out.println(RoomObject.LakeBoy.values()[1]);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    // End of Map Locations


       
    

}
