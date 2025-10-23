package org.example;
import java.util.Random;

public class MayoresAleatorios4 {
    // Método que devuelve el mayor de cuatro números
    public int max4(int a, int b, int c, int d) {
        if (a >= b && a >= c && a >= d) {
            return a;
        } else if (b >= a && b >= c && b >= d) {
            return b;
        } else if (c >= a && c >= b && c >= d) {
            return c;
        } else {
            return d;
        }
    }

    // Método que genera un array con los máximos de cuatro números aleatorios
    public int[] generarMaximos4(int repeticiones, Random rng) {
        if (repeticiones <= 0) {
            System.out.println("Las repeticiones no pueden ser un número negativo");
            return new int[0]; // Devuelve array vacío si hay error
        }
        int[] maximos = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            int num1 = rng.nextInt(1001); // Número entre 0 y 1000
            int num2 = rng.nextInt(1001);
            int num3 = rng.nextInt(1001);
            int num4 = rng.nextInt(1001);
            // Mostrar los cuatro números con el recuento de la cuaterna
            System.out.println("Numeros comparación " + (i + 1) + " : "+ num1 + ", " + num2 + ", " + num3 + ", " + num4);
            maximos[i] = max4(num1, num2, num3, num4);
        }
        return maximos;
    }
}
