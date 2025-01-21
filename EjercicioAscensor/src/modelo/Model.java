/*
En el modelo pondremos toda información como por ejemplo:
El número de piso.
Si sube o baja.
*/
package modelo;

import java.util.ArrayList;

/**
 * i1i4
 * @author Diego Andrés Caldera Beltrán
 */
public class Model {
    private ArrayList<Integer> numbers;
    private String up;
    private String down;

    public Model(ArrayList<Integer> numbers, String up, String down) {
        this.numbers = numbers;
        this.up = up;
        this.down = down;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }
    
    
}
