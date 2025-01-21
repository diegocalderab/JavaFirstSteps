/*
Diego Andrés Caldera Beltrán
29/10/2024
Prueba 1
*/
package prueba1;
import java.util.Scanner;
import java.util.Random;
public class Prueba1 {
    public static void main(String[] args) {
        String palabras[]= new String[4];
        int numeros[]= new int[3];
        String nombres[]= new String[4];
        String textosalida="";
        int x=0;
        while (x==0 || x==1 || x==2 || x==3){
            x=introducirmenuseleccion("");
        programa1 (palabras, x);
        programa2 (numeros, x);
        programa3 (nombres, x);
        if (x==4)
        salir (textosalida, x);
        }
    }
    private static void imprimirporpantalla(String texto) {
        System.out.println(texto);
    }
    private static int introducirmenuseleccion(String texto){
        Scanner teclado= new Scanner (System.in);
        imprimirporpantalla("Para seleccionar un programa utilice el número que sale al principio de cada uno: ");
        imprimirporpantalla("1. Se introduce 4 palabras sacarlas de tres formas distintas.");
        imprimirporpantalla("2. Se introduce 3 numero representarlos de 5 formas distintas.");
        imprimirporpantalla("3. Se introduce 4 nombres distintos asignar parejas.");
        imprimirporpantalla("4. Introduce el número 4 si quieres salir del programa.");
        return teclado.nextInt();  
    }
    private static void programa1(String[] palabras, int x) {
        if (x==1){
            imprimirporpantalla("Introduce 4 palabras: ");
            for (int i=0; i<4;i++){
                introducirpalabras("Introduce la "+ (i+1)+ "º palabra: ", i, palabras);
                System.out.println();
            }
            for (int i=0; i<3;i++){
                palabrasaleatorias(palabras);
                imprimirpalabras(palabras);
                System.out.println();
            }
        }
    }
    private static String introducirpalabras(String texto, int i, String[] palabras) {
        Scanner teclado= new Scanner (System.in);
        imprimirporpantalla(texto);
        return palabras[i]= teclado.nextLine();  
    }
    private static void palabrasaleatorias(String[] palabras) {
        Random random= new Random();
        for(int i=palabras.length-1; i>0;i--){
            int aleatorio=random.nextInt(i+1);
            String mezcla=palabras[i];
            palabras[i]= palabras[aleatorio];
            palabras[aleatorio]=mezcla;
        }
    }
    private static void imprimirpalabras(String[] palabras) {
        for (String pal: palabras){
            imprimirporpantalla(pal + " ");
        }
        System.out.println();
    }
    private static void programa2(int[] numeros, int x) {
        if (x==2){
            imprimirporpantalla("Introduce 3 numeros: ");
            for (int i=0; i<3;i++){
                introducirnumeros("Introduce el "+ (i+1)+ "º número: ", numeros, i);
                System.out.println();
            }
            for (int i=0; i<5;i++){
                numerosaleatorios(numeros);
                imprimirnumeros(numeros);
            }
        }
    }
    private static int introducirnumeros(String texto, int[] numeros, int i) {
        Scanner teclado = new Scanner (System.in);
        imprimirporpantalla(texto);
        return numeros[i]=teclado.nextInt();
    }
    private static void numerosaleatorios(int[] numeros) {
        Random random= new Random();
        for (int i=numeros.length-1; i>0; i--){
            int aleatorio=random.nextInt(i+1);
            int mezcla2=numeros[i];
            numeros[i] =numeros[aleatorio];
            numeros[aleatorio]= mezcla2;
        }
    }
    private static void imprimirnumeros(int[] numeros){
        for (int num: numeros){
            imprimirporpantalla(num + " ");
        }
        System.out.println();
    }
    private static void programa3(String[] nombres, int x) {
        if (x==3){
            imprimirporpantalla("Introduce 4 nombres: ");
            for (int i=0; i<4; i++){
                introducirnombres("Introduce el "+ (i+1)+ "º nombre: ", nombres, i);
            }
            imprimirporpantalla("La 1ª pareja es: "+(nombres[1]+" y "+ nombres[2]));
            imprimirporpantalla("La 2ª pareja es: "+ (nombres[0]+ " y "+ nombres[3]));
        }
    }
    private static String introducirnombres(String texto, String[] nombres, int i) {
        Scanner teclado = new Scanner (System.in);
        imprimirporpantalla(texto);
        return nombres[i]=teclado.nextLine();
    }
    private static void salir(String texto, int x) {
            imprimirporpantalla("Has salido del programa.");
            System.out.println();
    } 
}