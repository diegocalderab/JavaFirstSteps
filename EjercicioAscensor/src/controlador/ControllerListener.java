/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Model;
import vista.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.Scanner;
/**
 * i1i4
 * @author Diego Andrés Caldera Beltrán
 */
public class ControllerListener implements ActionListener {
    
    private Model model;
    private View view;

    public ControllerListener(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
