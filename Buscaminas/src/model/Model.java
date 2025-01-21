/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Model {
    private ArrayList <Integer> randomNumbers;
    private int numCuadradosPedidos;
    private int aciertos;
    private int fallos;
    private int numCuadradosBuenos;
    private ArrayList <String> datos;
    
    
    public Model(){
        randomNumbers = new ArrayList<>();
        aciertos=0;
        fallos=0;
        datos = new ArrayList<>();
    }

    public void rellenarDatos(){
        datos.add("ACIERTOS: ");
        datos.add("FALLOS: ");
    }
    
    
    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }

    
    public int getNumCuadradosPedidos() {
        return numCuadradosPedidos;
    }

    public void setNumCuadradosPedidos(int numCuadradosPedidos) {
        this.numCuadradosPedidos = numCuadradosPedidos;
        this.numCuadradosBuenos = numCuadradosPedidos/5;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public ArrayList<Integer> getRandomNumbers() {
        return randomNumbers;
    }

    public void generateRandomNumbers() {
    randomNumbers.clear();
    Random random = new Random();

    while (randomNumbers.size() < numCuadradosBuenos) {
        int randomNumber = random.nextInt(numCuadradosPedidos);

        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(randomNumber);
            }
        }
    }

    public int getNumCuadradosBuenos() {
        return numCuadradosBuenos;
    }

    public void setNumCuadradosBuenos(int numCuadradosBuenos) {
        this.numCuadradosBuenos = numCuadradosBuenos;
    }
}
