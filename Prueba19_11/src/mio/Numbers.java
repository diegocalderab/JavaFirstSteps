/*
Diego Andrés Caldera Beltrán
EXAC19
02/12/2024
*/
package mio;
import java.util.ArrayList;
import java.util.Random;
/**
 * @author EXAC19
 */
public class Numbers {       
    private ArrayList <Integer> numbers = new ArrayList <>(); //Declaramos un ArrayList de tipo entero para guardar los números.

    public int generatorOfNumbers(){ //Está es la función donde se generarán los números aleatoriamente.
        Random rand = new Random();
        return rand.nextInt(5)+1;
    }
    
    public void addNumber(int number){ //Al usar esta función en el main se guardaran los números en el ArrayList
        numbers.add(number);
    }
    
    public boolean game(){ //Esta función booleana nos servirá para saber si el jugador ha obtenido algún cuarteto ya que va a revisar el ArrayList en busca de cuartetos.
        for (int i=0; i<=5; i++){
            int counter=0; //Esta variable la utilizaré  para saber si los números se repiten
            for (int num: numbers){
                if (num == i){
                    counter++;
                }
            }
            if (counter==4){ //Al repetirse 4 veces me retornará verdadero por lo que hay un cuarteto.
                return true;
            }
        }
        return false; //Si no se repite 4 veces me da falso por lo que no hay un cuarteto. 
    }
    
    public void resetNumbers(){ //Esta función es para limpiar los números del ArrayList para que no se vayan acumulando partida tras partida.
        numbers.clear();
    }
    
}
