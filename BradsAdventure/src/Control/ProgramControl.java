


package Control;

import model.Player;

/**
 *
 * @author Brad Croft me@bradcroft.com
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        System.out.println("\n createPlayer called.");
        Player player = new Player();
        player.setName(playersName);

        bradsadventure.BradsAdventure.setPlayer(player);
        return player;
    }

}
