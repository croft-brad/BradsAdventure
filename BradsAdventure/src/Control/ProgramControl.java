package Control;

import model.Game;
import model.Player;

/**
 *
 * @author Brad Croft me@bradcroft.com
 */
public class ProgramControl {
    
    private static Player player = null; // Current player of the game
    private static Game game = null; // Current game being played

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ProgramControl.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        ProgramControl.game = game;
    }

    public static Player createPlayer(String playersName) {
        //System.out.println("\n createPlayer called.");
        Player player = new Player();
        player.setName(playersName);
        
        ProgramControl.setPlayer(player);
        
        return player;
    }

}
