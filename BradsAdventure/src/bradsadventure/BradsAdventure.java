/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bradsadventure;

import model.Game;
import model.Keys;
import model.Map;
import model.Player;
import model.Villain;
import view.StartProgramView;

/**
 *
 * @author Brad
 */
public class BradsAdventure {

    public static void main(String[] args) {
        
        // Start the "StartProgramView" class
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();

        // Player Information
        Player playerOne = new Player();

        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        playerOne.setPlayerLocation(5);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        // Game Information
        Game game = new Game();
        game.setNameOfGame("Brad's Fun Adventure Game");
        game.setNumOfMaps(3);
        game.setInventoryCount("Each player's inventory will vary with how much they hold at that time.");
        String gameInfo = game.toString();
        System.out.println(gameInfo);

        // Keys info
        Keys key = new Keys();
        key.setKeyShape("Triangle");
        String keyInfo = key.toString();
        System.out.println(keyInfo);

        // Villian info
        Villain villain = new Villain();
        villain.setWeakness(1);
        villain.setTaunt("You will wish you weren't born.");
        villain.setSuccessMessage("I didn't see that one coming");
        String villainInfo = villain.toString();
        System.out.println(villainInfo);

        // Map Info
        Map map = new Map();
        map.setRow(4);
        map.setColumn(4);
        String mapInfo = map.toString();
        System.out.println(mapInfo);

    }

    public static void setPlayer(Player player) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
