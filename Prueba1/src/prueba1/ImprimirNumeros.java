/*
Diego Andrés Caldera Beltrán
02/11/2024
*/

package prueba1;

import java.util.Random;
import java.util.Scanner;

public class ImprimirNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int limiteInferior = obtenerLimite(teclado, "inferior");
        int limiteSuperior = obtenerLimite(teclado, "superior");
        int tamañoArreglo = obtenerTamañoArreglo(teclado);

        int[] numerosGenerados = generarNumerosAleatorios(random, limiteInferior, limiteSuperior, tamañoArreglo);
        jugar(numerosGenerados, teclado);

    }

    private static int obtenerLimite(Scanner scanner, String tipo) {
        System.out.print("Introduce el límite " + tipo + ": ");
        return scanner.nextInt();
    }

    private static int obtenerTamañoArreglo(Scanner scanner) {
        System.out.print("Introduce el tamaño del arreglo: ");
        return scanner.nextInt();
    }

    private static int[] generarNumerosAleatorios(Random random, int limiteInferior, int limiteSuperior, int tamañoArreglo) {
        int[] numerosGenerados = new int[tamañoArreglo];
        boolean[] listaNumeros = new boolean[limiteSuperior - limiteInferior + 1];

        for (int i = 0; i < tamañoArreglo; i++) {
            int numero = random.nextInt((limiteSuperior - limiteInferior) + 1) + limiteInferior;

            while (listaNumeros[numero - limiteInferior]) {
                numero = random.nextInt((limiteSuperior - limiteInferior) + 1) + limiteInferior;
            }
            numerosGenerados[i] = numero;
            listaNumeros[numero - limiteInferior] = true;
        }

        return numerosGenerados;
    }

    private static void jugar(int[] numerosGenerados, Scanner scanner) {
        boolean[] numerosAdivinados = new boolean[numerosGenerados.length];
        int numerosAdivinadosCount = 0;

        System.out.println("Adivina los números generados en el rango especificado.");

        while (numerosAdivinadosCount < numerosGenerados.length) {
            System.out.print("Introduce un número: ");
            int numeroUsuario = scanner.nextInt();

            boolean adivinado = false;
            for (int j = 0; j < numerosGenerados.length; j++) {
                if (numerosGenerados[j] == numeroUsuario && !numerosAdivinados[j]) {
                    System.out.println("¡Correcto! Has adivinado un número.");
                    numerosAdivinados[j] = true;
                    numerosAdivinadosCount++;
                    adivinado = true; // Se encontró un número correcto
                }
            }

            if (!adivinado) {
                System.out.println("Número incorrecto o ya adivinado. Intenta de nuevo.");
            }
        }

        System.out.println("¡Felicidades! Has adivinado todos los números.");
    }
}

