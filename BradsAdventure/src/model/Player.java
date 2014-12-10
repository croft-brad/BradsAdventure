package model;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {

    private String playerName;
    private int playerLocation;
    private double bestTime;

    public Player() {
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", playerLocation=" + playerLocation + ", bestTime=" + bestTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.playerName);
        hash = 37 * hash + this.playerLocation;
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (this.playerLocation != other.playerLocation) {
            return false;
        }
        return true;
    }

    public void setName(String playersName) {
        this.playerName = playersName;

    }

}
