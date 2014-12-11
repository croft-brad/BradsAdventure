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
public class HelpMenuView {

    private final String MENU = "\n"
            + "\n++++++++++++++++++++++++++++++++++++++++"
            + "\n+              Help Menu               +"
            + "\n++++++++++++++++++++++++++++++++++++++++"
            + "\n+ G - Game play                        +"
            + "\n+ Z - Puzzles                          +"
            + "\n+ T - Treasure Chests                  +"
            + "\n+ V - Villians                         +"
            + "\n+ P - Power Crystals                   +"
            + "\n+ C - Clues                            +"
            + "\n+ K - Keys                             +"
            + "\n+ W - Winning the game                 +"
            + "\n+ E - Exit to Main Menu                +"
            + "\n++++++++++++++++++++++++++++++++++++++++";

    void displayMenu() {
        char selection = ' ';
        do {

            System.out.println(MENU);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        } while (selection != 'E');
    }

    private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter your menu choice.");
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                continue;
            }
            break;
        }

        return input;
    }

    private void doAction(char choice) {

        switch (choice) {
            case 'G':
                this.gamePlayHelpView();
                break;
            case 'Z':
                this.puzzleHelpView();
                break;
            case 'T':
                this.TreasureHelpView();
                break;
            case 'V':
                this.villainsView();
                break;
            case 'P':
                this.powerCrystalHelpView();
                break;
            case 'C':
                this.clueHelpView();
                break;
            case 'K':
                this.keyHelpView();
                break;
            case 'W':
                this.winGameHelpView();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void gamePlayHelpView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void puzzleHelpView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void TreasureHelpView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void powerCrystalHelpView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void clueHelpView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void villainsView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void keyHelpView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void winGameHelpView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
