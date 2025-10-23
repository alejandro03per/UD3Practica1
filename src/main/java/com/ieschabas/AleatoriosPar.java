package com.ieschabas;
import java.util.Random;
import java.util.Scanner;

public class AleatoriosPar {
    public int parAleatorioMenorQue(int limite, Random rng) {
        Scanner scanner = new Scanner(System.in); // Para leer input del usuario

        while (limite <= 0) {
            System.out.println("El límite no puede ser un número negativo");
            System.out.print("Por favor, introduce un nuevo límite: ");
            limite = scanner.nextInt(); // Leemos el nuevo límite
        }

        int maximoPar;
        if (limite % 2 == 0) { // Si el límite es par
            maximoPar = limite - 2; // Ejemplo: si limite es 10, el par más grande es 8
        } else { // Si el límite es impar
            maximoPar = limite - 1; // Ejemplo: si limite es 9, el par más grande es 8
        }

        if (maximoPar < 0) {
            maximoPar = 0;
        }

        int numeroAleatorio = rng.nextInt((maximoPar / 2) + 1); // Ejemplo: para maximoPar=8, genera 0, 1, 2, 3, 4
        int numeroPar = numeroAleatorio * 2; // Multiplicamos por 2 para que sea par: 0, 2, 4, 6, 8

        return numeroPar; // Devolvemos el número par
    }
}
