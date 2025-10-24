package com.ieschabas;

/**
 *programa que muestra el producto de los 10 primeros números impares.
 * @author Alejandro
 * @version 1.0
 */


public class NumerosImpares {
    public long productoDiezPrimerosImpares(){


        long producto = 1;
        int contador = 0;
        long numero = 1;

        System.out.println("Los primeros 10 numero impares: ");
        while (contador < 10) {
            if (numero % 2 != 0) {
                System.out.println(numero);
                producto *= numero;
                contador++;
            }
            numero += 2;
        }
        return producto;


    }
}
