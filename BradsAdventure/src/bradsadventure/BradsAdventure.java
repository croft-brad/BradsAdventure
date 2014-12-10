/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bradsadventure;

import model.Game;
import model.Player;

/**
 *
 * @author Brad
 */
public class BradsAdventure {

    public static void main(String[] args) {
      
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
        
    }   
}