package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brad Croft me@bradcroft.com
 */
public class Map implements Serializable {

    private int row;
    private int column;
 // private Location[][] locations;
    private int noOfColumns;
    private int noOfRows;
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    private String objectName;
    private char objectSymbol;
    private int objectState;

    public Map(){
    }
    
 

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public char getObjectSymbol() {
        return objectSymbol;
    }

    public void setObjectSymbol(char objectSymbol) {
        this.objectSymbol = objectSymbol;
    }

    public int getObjectState() {
        return objectState;
    }

    public void setObjectState(int objectState) {
        this.objectState = objectState;
    }

    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column +  '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + Objects.hashCode(this.objectName);
        hash = 79 * hash + this.objectSymbol;
        hash = 79 * hash + this.objectState;
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
        final Map other = (Map) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.objectName, other.objectName)) {
            return false;
        }
        if (this.objectSymbol != other.objectSymbol) {
            return false;
        }
        if (this.objectState != other.objectState) {
            return false;
        }
        return true;
    }
    
    
    

}
