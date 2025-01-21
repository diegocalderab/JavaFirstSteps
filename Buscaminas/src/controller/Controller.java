/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.*;
import model.Model;
import view.View;

/**
 *
 * @author diego
 */
public class Controller {
    private Model model;
    private View view;
    
    public Controller(){
        this.model = new Model();
        this.view = new View();
        
        crearBotones();
        crearEtiquetas();
        activarEventoBoton();
        view.hacerVisible(true);
    }

    private void crearBotones() {
        String numCuadradosTotales = JOptionPane.showInputDialog("Introduce cuantos cudradados quieres en tu buscaminas: ");
        model.setNumCuadradosPedidos(Integer.parseInt(numCuadradosTotales));
        
        model.generateRandomNumbers();
        
        for (int i=0;i< model.getNumCuadradosPedidos();i++){
            boolean esCuadradoCorrecto = model.getRandomNumbers().contains(i);
            view.crearBotones(i, esCuadradoCorrecto);
        }
    }

    private void crearEtiquetas() {
        for(int i=0; i<model.getDatos().size();i++){
            view.crearEtiquetas(model.getDatos().get(i));
        }
    }

    private void activarEventoBoton() {
        for (int i = 0; i < view.getBotones().size(); i++){
            this.view.getBotones().get(i).addActionListener(new CoListener(model, view));
        }
    }
}
