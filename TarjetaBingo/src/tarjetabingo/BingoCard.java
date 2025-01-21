/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetabingo;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class BingoCard {
    private ArrayList <Lines> numberLines = new ArrayList <>();
    private int cardNumber;

    public BingoCard(int cardNumber, int numberOfLines, int lineSize) {
        this.cardNumber = cardNumber;
        for (int i=0; i < numberOfLines; i++){
            numberLines.add(new Lines(lineSize));
        }
    }

    @Override
    public String toString() {
        String result ="Tarjeta bingo #" + cardNumber + "\n";
        for (int i = 0; i < numberLines.size(); i++) {
            result += "  Línea " + (i + 1) + ": " + numberLines.get(i) + "\n";
        }
        return result;
    }

    
    
    
    
    
    
    
}
