/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import model.Model;

/**
 *
 * @author diego
 */
public class View extends JFrame {
    private ArrayList <JPanel> paneles;
    private ArrayList <JButton> botones;
    private ArrayList <JLabel> etiquetas;
    private GridBagConstraints gbc;
    private Model model;

    public View() {
        paneles = new ArrayList <>();
        botones = new ArrayList <>();
        etiquetas = new ArrayList <>();
        model = new Model();
        gbc= new GridBagConstraints();
        cambiarTitulo("");
        propiedadesPaneles();
        propiedadesVentana();
    }
    
    

    private void propiedadesVentana() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT,100,100));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    public void crearEtiquetas(String datos){
        JLabel etiqueta = new JLabel(datos);
        etiquetas.add(etiqueta);
        paneles.get(1).add(etiquetas.get(etiquetas.size()-1));
        this.pack();
    }
    
    public void crearBotones(int index, boolean esCuadradoBueno) {
        JButton boton = new JButton("Cuadrado " + index);
        boton.setPreferredSize(new Dimension(50,50));
        boton.putClientProperty("esCuadradoBueno", esCuadradoBueno);
        botones.add(boton);
        paneles.get(0).add(botones.get(botones.size()-1),0);// Cada boton se añade en la parte
        // De arriba y los va empujando hacia abajo
        this.pack();
    }
    
    public void hacerVisible(boolean b){
        this.setVisible(b);
    }
    
    public ArrayList<JButton> getBotones() {
        return botones;
    }

    public ArrayList<JLabel> getEtiquetas() {
        return etiquetas;
    }
    public void cambiarTitulo(String titulo){
        this.setTitle(titulo);
    }
    public void cambiarTextoEtiqueta(int i, String texto){
        etiquetas.get(i).setText(texto);

    }

    private void propiedadesPaneles() {
        JPanel panelBotones = new JPanel (new GridLayout(model.getNumCuadradosPedidos(), 1, 5,5));
        paneles.add(panelBotones);
        
        JPanel panelTexto = new JPanel(new GridLayout(1, 2));
        panelTexto.setBackground(Color.lightGray);
        paneles.add(panelTexto);
        
        add(panelBotones);
        add(panelTexto);
    }

    private void ajustarBotones(GridBagConstraints gbc) {
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
    }
    
    
}
