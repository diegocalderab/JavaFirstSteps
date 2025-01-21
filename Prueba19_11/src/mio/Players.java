/*
Diego Andrés Caldera Beltrán
EXAC19
02/12/2024
*/
package mio;
import java.util.ArrayList;
/**
 * @author EXAC19
 */
public class Players {
    private String namePlayer; //Declaramos la variable del nombre del jugador.
    
    //CONSTRUCTOR
    public Players(String namePlayer) { 
        this.namePlayer = namePlayer;
    }
    
    //GETTER Y SETTER
    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }
 
}
