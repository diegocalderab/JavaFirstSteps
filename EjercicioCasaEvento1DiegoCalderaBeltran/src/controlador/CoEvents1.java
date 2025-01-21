/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import ejerciciocasaevento1.eventos1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import vista.ViEventos1;

/**
 *
 * @author diego
 */
public class CoEvents1 extends ViEventos1{
    {
        private int i;

      
        public void actionPerformed(ActionEvent ae)
        // getActionCommand captura el nombre del botton
        
        {                        
            if(ae.getActionCommand().equals("boton1"))
            {
                boton.setText("boton2");
                boton.setBackground(Color.BLUE);
                boton.setForeground(Color.GREEN);
            }
            else
            {
                boton.setText("boton1");
                boton.setBackground(Color.GREEN);
                boton.setForeground(Color.BLUE);  
                
                System.out.println("Click: " + (++i));
                if(i==4) boton.setEnabled(false);
            }                        
        }                       
    }
}
