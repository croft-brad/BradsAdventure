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
class TreasureView {

    void displayTreasure() {
        String[] treasureItems = {"1 gold coin", "5 gold coins", "10 gold coins", "sword", "shield", "food"};

        System.out.println("Here is the list of items in a treasure chest: ");
        for (String str : treasureItems) {
            System.out.println( str);
        }
     //   System.out.println("Please input an index item:");

    //    System.out.print(treasureItems[getInput()]); // Not sure why this error appears, I don't have an integer.
    }

    public String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter an index from 0 to 5.");
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Invalid choice - Please enter something.");
                continue;
            }
            break;
        }
 return input;
    }
}