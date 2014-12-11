package view;

import Control.ProgramControl;
import java.util.Scanner;
import model.Player;

/**
 *
 * @author Brad Croft me@bradcroft.com
 */
public class StartProgramView {

    public void startProgram() {
        // Display the banner screen
        this.displayBanner();

        // prompt the player to enter their name. Retrieve the name of the player
        String playersName = this.getPlayersName();

        // create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        // Display a personalized welcome message.
        this.displayWelcomeMessage(player);

        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("You are going to go on an adventure. Please pack "
                + "your things that you will need. If you don't have something "
                + "then you can find it in our game."); // Add more to this later.
    }

    public String getPlayersName() {
        // This will get the user's input for their name.
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { // while a valid name has not been retrieved
            // prompt for  the player's name
            System.out.println("Enter the Players Name below");

            // get their name
            playersName = keyboard.nextLine(); //Gets the next input from the user.
            playersName = playersName.trim(); // Trims off any added space before or after the name.

            // Makes sure they enter something for their name.
            if (playersName.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                continue;
            }
            break; // out of the repition or exits
        }

        return playersName;

    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n *****************************************************************\n");
        System.out.println("**********\t Welcome to the game " + player.getPlayerName() + " ******************");
        System.out.println("**********\t Have fun storming the castle!" + " \t******************");
        System.out.println("\n *****************************************************************");

    }

}
