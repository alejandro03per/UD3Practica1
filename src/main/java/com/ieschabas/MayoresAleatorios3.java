package com.ieschabas;
import java.util.Random;

/**
 *programa que usa un algoritmo que devuelva el mayor de tres números aleatorios (entre 0 y 1000)
 * El proceso se repite 20 veces
 * @author Alejandro
 * @version 1.0
 */

public class MayoresAleatorios3 {
    // Método que devuelve el mayor de tres números
    public int max3(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // Método que genera un array con los máximos de tres números aleatorios
    public int[] generarMaximos3(int repeticiones, Random rng) {
        if (repeticiones <= 0) {
            System.out.println("Las repeticiones no pueden ser un número negativo");
            return new int[0]; // Devuelve array vacío si hay error
        }
        int[] maximos = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            int num1 = rng.nextInt(1001); // Número entre 0 y 1000
            int num2 = rng.nextInt(1001);
            int num3 = rng.nextInt(1001);
            // Mostrar los tres números con el recuento de la terna
            System.out.println("Numeros comparación " + (i + 1) + " : " + num1 + ", " + num2 + ", " + num3);
            maximos[i] = max3(num1, num2, num3);
        }
        return maximos;
    }
}
