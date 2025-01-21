/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.Model;
import view.View;
/**
 *
 * @author diego
 */
public class CoListener implements ActionListener {
    
    private Model model;
    private View view;
    
    public CoListener(Model model, View view){
        this.model = model;
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        Boolean esCuadradoBueno = (Boolean) boton.getClientProperty("esCuadradoBueno");

        if (esCuadradoBueno != null && esCuadradoBueno) {
            boton.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Has acertado!");
            
        } else {
            
            boton.setBackground(Color.RED);
            boton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Has fallado!");
        }
    }

    
    
}
