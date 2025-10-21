package org.example;

import java.util.Scanner;

public class NumerosImpares {
    public static long productoDiezPrimerosImpares(){


        int producto = 1;
        int numeroImpar = 0;
        long resultado = 1;

        while (producto < 10) {
            if (producto % 2 != 0) {
                producto *= resultado;
                numeroImpar++;
            }
            resultado += 2;
        }
        return producto;


    }
}
