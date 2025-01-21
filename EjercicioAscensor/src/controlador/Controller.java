/*
En el controlador es donde importaremos ambas clase de vista y modelo, para aquí
empezar con la programación del programa y como funcionará añadiendo una serie de
métodos.
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
public class Controller {
    private Model model;
    private View view;
    private Scanner keyb = new Scanner(System.in);
    private int currentFloor;
    private boolean start;
    
    public Controller(){
        
        //Aquí empieza preguntando al cliente cuántos pisos necesita.
        System.out.println("Introduce el número de pisos: ");
        int totalFloors = keyb.nextInt();
        if (totalFloors <= 0){
            start=true;
            while(start){
                System.out.println("Este número de pisos no es válido. Ponga otro dato.");
                totalFloors = keyb.nextInt();
                if (totalFloors > 0){
                    start=false;
                }
            }
        }
        
        //Creo un arrayList para meter dentro el total de números.
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i<=totalFloors; i++){
            numbers.add(i);
        }
        
        //Llamada al modelo y a la vista.
        model = new Model(numbers, "Subiendo", "Bajando");
        view = new View();
        
        //Aquí se crean los botones en base al número de pisos pedidos.
        for (int i=0; i<totalFloors; i++){
            view.createButtons();
        }
        
        //Para mostrar la vista.
        view.setView(true);
        
        //Método donde nos llevará a las funciones.
        addListeners();
    }
    
    
    //Método privado donde vamos a ejecutar todas las funciones del programa.
    private void addListeners() {
        
        /* Empezamos creando un arraylist e igualandolo al método de getButtons de la vista.
        Y así darle las funciones a cada boton de la vista. */
        ArrayList <JButton> buttons = view.getButtons();
        
        //Empieza el bucle para dar la respectiva funcion a cada boton.
        for (int i=0; i<buttons.size(); i++){
            //Variable piso para coger los números del modelo y saber en que piso estamos.
            int floor = model.getNumbers().get(i);
            JButton button = buttons.get(i);
            
            //Aquí nos pondra en cada boton el piso en el que estamos.
            button.setText("Piso "+ floor);
            
            //Aquí es donde cada botón tomara su respectiva función.
            button.addActionListener(new ActionListener(){
                
                
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    //Creamos variable para saber la dirección en la que se mueve el ascensor
                    String direction;
                    
                    /* Creamos una condicion para saber dependiendo del piso en el que estamos, comparandolo con el anterior
                    si subimos o bajamos */
                    if (floor > currentFloor) {
                        direction = model.getUp();
                    } else if (floor < currentFloor) {
                        direction = model.getDown();
                    } else {
                        direction = "Ya está en este piso";
                    }
                    
                    //Aquí es donde se asignará a la variable el piso actual.
                    currentFloor = floor;
                    
                    //Variable para que imprima en que piso estamos y su dirección.
                    String status = "Piso actual: "+ floor + " (" + direction + ") ";
                    
                    /* 
                    Esta condición nos servirá para saber si la lista de la vista "tags" está
                    vacía o rellena.
                    Si la lista esta vacía esta creara un tag con la variable "status" anteriormente creada,
                    después esta se añadira a la lista "tags" de vista y se mostrara dentro de la ventana.
                    
                    Si la lista esta rellena, está se vaciara y después añadira la variable "status",
                    esto lo hacemos con el fin de no tener que hacer un "tag" nuevo cada vez que cambiemos
                    de piso.
                    */
                    
                    if (view.getTag().isEmpty()){
                        JLabel tag = new JLabel(status);
                        view.getTag().add(tag);
                        view.getContentPane().add(tag);
                    } else {
                        view.getTag().get(0).setText(status);
                    }
                    
                    //Con esto nos aseguramos de que todo se vea correctamente.
                    view.pack();
                }
                
            });
            
        }
    }
}
