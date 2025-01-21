//Aquí en la vista es donde pondré todo lo que se vea por pantalla.

package vista;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * i1i4
 * @author Diego Andrés Caldera Beltrán
 */
public class View extends JFrame {
    /*
    Aquí declaro los ArrayList de botones, etiquetas y paneles. 
    Por si en un futuro hay que agrandarlos o lo que sea.
    */
    private ArrayList<JButton> buttons;
    private ArrayList<JLabel> tags;
    private ArrayList<JPanel> panel;
    
    public View(){
        super("Ascensor");
        buttons= new ArrayList<>();
        tags = new ArrayList<>();
        panel = new ArrayList<>();
        windowProperties();
        panelProperties();
    }
    
    
    //Este método nos servira para crear los botones.
    public void createButtons(){
        JButton button = new JButton();
        
        button.setPreferredSize(new Dimension(100,50));
        
        buttons.add(button);
        panel.get(1).add(button); //Aquí asignamos en que panel se encuentra.
        
        this.pack();
    }
    
    //Este método es para saber las propiedades de la ventana
    public void windowProperties() {
        this.setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    /* Este método es para conseguir las propiedades del panel,
    para saber que contiene cada uno */
    public void panelProperties() {
        JPanel panelButtons = new JPanel();
        panel.add(panelButtons);
        
        JPanel panelTags= new JPanel();
        panel.add(panelTags);
        
        add(panelButtons);
        add(panelTags);
    }
    
    //Método para hacer visible la vista.
    public void setView(boolean b){
        this.setVisible(b);
    }
    
    public ArrayList <JButton> getButtons(){
        return buttons;
    }
    
    public ArrayList <JLabel> getTag(){
        return tags;
    }
}
