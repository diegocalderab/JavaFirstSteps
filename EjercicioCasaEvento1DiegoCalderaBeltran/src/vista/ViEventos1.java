package vista;

// View.java
import javax.swing.*;
import java.awt.*;

public class ViEventos1 extends JFrame {
    private JButton boton;

    public ViEventos1(String title) {
        super(title);
        setSize(new Dimension(300, 300));
        setLayout(new FlowLayout(FlowLayout.CENTER));
        boton = new JButton("boton1");
        boton.setBackground(Color.GREEN);
        boton.setForeground(Color.BLUE);
        add(boton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton getButton() {
        return boton;
    }
}