package model;

import java.util.Objects;

/**
 *
 * @author Brad Croft me@bradcroft.com
 */
public class Game {

    private String nameOfGame;
    private Player playerName;
    private Player playerLocation;
    private int NumOfMaps;
    private String InventoryCount;

    public Game() {
        this.nameOfGame = " ";
        this.playerName = null;
        this.playerLocation = null;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public Player getPlayerName() {
        return playerName;
    }

    public void setPlayerName(Player playerName) {
        this.playerName = playerName;
    }

    public Player getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Player playerLocation) {
        this.playerLocation = playerLocation;
    }

    @Override
    public String toString() {
        return "Game{" + "nameOfGame=" + nameOfGame + ", playerLocation=" + playerLocation + ", NumOfMaps=" + NumOfMaps + ", InventoryCount=" + InventoryCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nameOfGame);
        hash = 97 * hash + Objects.hashCode(this.playerName);
        hash = 97 * hash + Objects.hashCode(this.playerLocation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.nameOfGame, other.nameOfGame)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerLocation, other.playerLocation)) {
            return false;
        }
        return true;
    }

    public void setNumOfMaps(int NumOfMaps) {
        this.NumOfMaps = NumOfMaps;

    }

    public void setInventoryCount(String InventoryCount) {
        this.InventoryCount = InventoryCount;
    }

}
