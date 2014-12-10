
package model;


import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Brad Croft me@bradcroft.com
 */


public class Villain {
    
    private int weakness;
    private String taunt;
    private String successMessage;
    
     public Villain() {
    }
    
    public int getWeakness() {
        return weakness;
    }

    public void setWeakness(int weakness) {
        this.weakness = weakness;
    }

    public String getTaunt() {
        return taunt;
    }

    public void setTaunt(String taunt) {
        this.taunt = taunt;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    @Override
    public String toString() {
        return "A villain's{" + "weakness=" + weakness + ", taunt=" + taunt + ", successMessage=" + successMessage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.weakness;
        hash = 37 * hash + Objects.hashCode(this.taunt);
        hash = 37 * hash + Objects.hashCode(this.successMessage);
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
        final Villain other = (Villain) obj;
        if (this.weakness != other.weakness) {
            return false;
        }
        if (!Objects.equals(this.taunt, other.taunt)) {
            return false;
        }
        if (!Objects.equals(this.successMessage, other.successMessage)) {
            return false;
        }
        return true;
    }
}