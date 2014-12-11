package view;

import Control.GameControl;
import bradsadventure.BradsAdventure;
import java.util.Scanner;

public class MainMenuView {

    private final String MENU = "\n++++++++++++++++++++++++++++++++++++++++"
            + "                          Main Menu               "
            + "            n++++++++++++++++++++++++++++++++++++++++"
            + "            \n N - New game                         "
            + "            \n L - Load the game                    "
            + "            \n S - Save the game                    "
            + "            \n H - Get help on how to play the game "
            + "            \n O - List the Objects in the game     "
            + "            \n E - Exit                             "
            + "            \n++++++++++++++++++++++++++++++++++++++++";

    public String getInput() {

        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        // while a valid Selection has not been retrieved
        while (!valid) {

            //prompt for the player's selection
            System.out.println("\t\nEnter your selection below.");
            //get the value entered from the keyboard
            input = keyboard.nextLine(); // Puts the input on the next line
            input = input.trim(); // Trims off any before or after spaces.

            if (input.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                continue;
            }
            break;
        }
        return input;
    }

    void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); // this will display the menu

            String input = this.getInput(); ///get the user's selection
            selection = input.charAt(0); // get the first character that they enter

            this.doAction(selection); // do the action based on the selection of input they did

        } while (selection != 'E');
    }

    public void doAction(char choice) {

        switch (choice) {
            case 'N': //creates and starts a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // exits the game
                return;
            default:
                System.out.println("\n*** Invalid Selection. Please try again. ***\n");
                break;
        }
    }

    private void startNewGame() {
        // System.out.println("*** startNewGame function called ***");

        // Creates a new Game
        GameControl.createNewGame(BradsAdventure.getPlayer());
        
        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** startSaveGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

}
