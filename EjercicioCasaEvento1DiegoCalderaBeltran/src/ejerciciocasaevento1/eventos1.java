package ejerciciocasaevento1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class eventos1 extends JFrame{

    private JButton boton;
    FlowLayout fy;

    public eventos1(String nombreBoton)
    {
     super(nombreBoton);     
     setSize(new Dimension(300,300));   
     fy = new FlowLayout(FlowLayout.CENTER);
     getContentPane().setLayout(fy);

     boton = new JButton("boton1");     
     getContentPane().add(boton); 
     boton.setBackground(Color.GREEN);
     boton.setForeground(Color.BLUE);

     boton.addActionListener(new Oyente());

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     System.out.println("ADIOS");          
    }

    public static void main(String[] args) 
    {
        eventos1 frame = new eventos1("Ejemplo de Botones");
        frame.setVisible(true);
    }
   
    // DEFINICION DE LA ACCION DEL LISTENER
    class Oyente implements ActionListener
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