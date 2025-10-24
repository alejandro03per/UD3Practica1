package com.ieschabas;
import java.util.Scanner;

/**
 *Programa para realizar un juego para adivinar un número.
 *El usuario tiene que adivinar el numero random insertando el los numeros
 * @author Alejandro
 * @version 1.0
 */

public class JuegoAdivinar {
    public void evaluarIntento(int secreto, int intento, int[] intentos) { //Array de datos
        intentos[0]++; // Incrementa el contador de intentos
        if (intento < secreto) {
            System.out.println("El número es menor. Has realizado " + intentos[0] + " intentos");
        } else if (intento > secreto) {
            System.out.println("El número es mayor. Has realizado " + intentos[0] + " intentos");
        } else {
            System.out.println("Has acertado!");
        }
    }

    public int jugar(int secreto, int[] intentos) { //Array de datos
        Scanner scanner = new Scanner(System.in); //Función sacanner
        int intento;

        while (true) {
            System.out.print("Introduce un número del 1 al 10: "); //Pide al usuario insertar un numero
            intento = scanner.nextInt();

            if (intento < 0) { // Si el usuario ingresa un número negativo, se rinde
                return -1;
            }

            evaluarIntento(secreto, intento, intentos);

            if (intento == secreto) { // Si acierta, devuelve el número de intentos
                return intentos[0];
            }
        }
    }
}
