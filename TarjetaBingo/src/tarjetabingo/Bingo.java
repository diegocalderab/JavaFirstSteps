/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetabingo;

import java.util.Scanner;
import java.util.ArrayList;

public class Bingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyb = new Scanner (System.in);
        int numberOfCards;
        int numberOfLines;
        int lineSize;
        ArrayList <BingoCard> cards = new ArrayList <>();
        
        System.out.println("BIENVENIDO AL BINGO!");
        
        System.out.println("Introduce cuantos cartones quieres jugar: ");
        numberOfCards= keyb.nextInt();
        System.out.println("Introduce cuantas lineas quieres en tu cartón: ");
        numberOfLines= keyb.nextInt();
        System.out.println("Introduce el tamaño de las líneas: ");
        lineSize= keyb.nextInt();
        
        for (int i = 0; i < numberOfCards; i++) {
            cards.add(new BingoCard(i + 1, numberOfLines, lineSize));
        }

        System.out.println("\n¡Cartones generados!");
        for (BingoCard card : cards) {
            System.out.println(card);
        }
        
        
    }
    
}
