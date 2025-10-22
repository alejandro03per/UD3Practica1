package org.example;
import java.util.Scanner;

public class JuegoAdivinar {
    public void evaluarIntento(int secreto, int intento, int[] intentos) {
        intentos[0]++; // Incrementa el contador de intentos
        if (intento < secreto) {
            System.out.println("El número es menor. Has realizado " + intentos[0] + " intentos");
        } else if (intento > secreto) {
            System.out.println("El número es mayor. Has realizado " + intentos[0] + " intentos");
        } else {
            System.out.println("Has acertado!");
        }
    }

    public int jugar(int secreto, int[] intentos) {
        Scanner scanner = new Scanner(System.in);
        int intento;

        while (true) {
            System.out.print("Introduce un número del 1 al 10: ");
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
