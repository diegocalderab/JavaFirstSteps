/*
Diego Andrés Caldera Beltrán
EXAC19
02/12/2024
*/
package mio;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author EXAC19
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyb = new Scanner (System.in);
        String nameOfPlayers = null; //Variable utilizada para introducir los nombres de los jugadores.
        boolean endGame = false; //Booleano para hacer el bucle del juego y que este no acabe a menos que se cumpla un requisito.
        int numberOfPlayers; //Variable utilizada para saber cuantos jugadores quieren jugar.
        Numbers numbers = new Numbers(); //Aquí creamos el objeto de la clase Numbers para almacenar cada número.
        ArrayList <Players> players = new ArrayList <>(); //Arraylist de los jugadores de la partida.
        ArrayList <Integer> gameWons = new ArrayList <>(); //Arraylist del número de partidas ganadas por cada jugador.
        
        print("Introduce cuantos jugadores van a participar: ");
        numberOfPlayers=keyb.nextInt(); //Este será el número de jugadores introducidos por teclado que participarán en la partida.
        keyb.nextLine(); //Conseguimos limpiar el búfer, para que no haya salto de líneas.

        addPlayers(keyb, players, numberOfPlayers, nameOfPlayers, gameWons); //En este método vamos a poder añadir los nombres de los jugadores.     
        gameStart(endGame, numbers, gameWons, players, keyb); //En este método es donde se desarrolla todo el juego.
    }
    private static void addPlayers(Scanner keyb, ArrayList<Players> players, int numberOfPlayers, String nameOfPlayers, ArrayList<Integer> gameWons) {
        for (int i=0; i<numberOfPlayers; i++){
            System.out.println("Introduce el nombre del "+ (i+1)+ "º jugador/a: ");
            nameOfPlayers= keyb.nextLine();
            players.add(new Players(nameOfPlayers)); //Gracias a esta función conseguiremos guardar los nombres introducidos por teclado de cada jugador.
            gameWons.add(0); //Con esto ponemos todos los contadores de victorias en 0 porque todos los jugadores deben empezar de 0.
        }
    }
    private static void gameStart(boolean endGame, Numbers numbers, ArrayList<Integer> gameWons, ArrayList<Players> players, Scanner keyb) {
        print("¡EL JUEGO HA COMENZADO!"); 
        while (!endGame){  //Hacemos un bucle que al ser diferente de la variable booleana declarada anteriormente este bucle se hará.
            print("Cargando una nueva partida");
            boolean quartetFound = false;
            
            numbers.resetNumbers(); //Con esto conseguimos reiniciar los números, ya que esta función la hemos declarado en la clase Numbers.
            
            while (!quartetFound){
                for (int i=0; i<players.size();i++){
                   Players player = players.get(i); //Aquí se declara un objeto del arraylist Players, para que se les vayan asignando un número a cada jugador.
                   int number = numbers.generatorOfNumbers(); //Se generan los números aleatoriamente ya que la clase 'generatorOfNumbers' hemos usado el random.
                   numbers.addNumber(number); //Se van añadiendo los números al arrayList de números de cada jugador.
                   
                    print("El jugador "+ player.getNamePlayer()+ " obtuvo el número: "+ number);
                    
                    if (numbers.game()){ //Al hacer este if conseguimos declarar la funcion usada en la clase Numbers, donde hace el booleano para saber si el programa encuentra el número repetido 4 veces para formar un cuarteto.
                        print("El jugador "+ player.getNamePlayer()+ " obtuvo un cuarteto");
                        gameWons.set(i, gameWons.get(i)+1); //Esta función nos hará la suma de cada juego ganado.
                        quartetFound=true; //Nos devuelve true por lo tanto va a volver a ejecutar el bucle.
                    }
                }
            }
            print("Resultados actuales: ");
            for (int i=0; i<players.size();i++){ //Este for nos servirá para que imprima cuantas rondas ha ganado cada jugador por ronda.
                print(players.get(i).getNamePlayer()+ ": "+ gameWons.get(i)+ " partidas ganadas." );
            }
            
            for (int i=0; i<gameWons.size();i++){
                if(gameWons.get(i) == 3){ //Este if sirve para que cuando se alcancen 3 juegos ganados por cualquier jugador el while acabará.
                    endGame=true;
                }
            }
            
            print("Fin del juego: ");
            for (int i=0; i<players.size(); i++){
                if (gameWons.get(i) == 3){ //Cuando un jugador tenga 3 juegos ganados este if ejecutara quien es el ganador del juego.
                    print(players.get(i).getNamePlayer()+ " es el ganador del juego.");
                }
            }
        }
        
        
    }
    private static void print(String texto) { //Método utilizado para imprimir por pantalla.
        System.out.println(texto);
    }
}