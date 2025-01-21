/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.*;
/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyb= new Scanner (System.in);
        ArrayList <Cars> cars = new ArrayList <>();
        ArrayList <Personal> personal = new ArrayList <>();
        
        //Aquí añadire los valores predeterminados dentro del arrayList de Coches.
        cars.add(new Cars("Audi", "Negro"));
        cars.add(new Cars("BMW", "Blanco"));
        cars.add(new Cars("Toyota", "Rojo"));
        cars.add(new Cars("Honda", "Verde"));
        cars.add(new Cars("Citröen", "Amarillo"));
        
        //Aquí añadire los valores predeterminados dentro del arrayList de Personal.
        personal.add(new Personal("Ángel", "Director", 3000));
        personal.add(new Personal("María", "Oficial", 1500));
        personal.add(new Personal("Juan", "Medico", 2700));
        personal.add(new Personal("Guadalupe", "Informático", 1700));
        
        for (Personal p: personal){
            if (p.getSalary() >= 2000){
                System.out.println(p.getName() + "tiene salario mayor");
            }
        }
    }
    
}
