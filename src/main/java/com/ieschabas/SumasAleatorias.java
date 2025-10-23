package com.ieschabas;
import java.util.Random;

public class SumasAleatorias {
    // Método que suma dos números aleatorios
    public int sumaDosAleatorios() {
        Random random = new Random();
        int numero1 = random.nextInt(1000); // Número entre 0 y 1000
        int numero2 = random.nextInt(1000); // Otro número entre 0 y 1000
        return numero1 + numero2;
    }

    // Método que genera un array con 20 sumas
    public int[] generarSumas() {
        int[] resultados = new int[20]; // Siempre 20 sumas
        for (int i = 0; i < 20; i++) {
            resultados[i] = sumaDosAleatorios();
        }
        return resultados;
    }
}
