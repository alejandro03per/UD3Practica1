package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        //System.out.println();
        //MenuVehiculos menuVehiculos = new MenuVehiculos();

        //System.out.println(menuVehiculos.seleccionarOpcion(1));

        //Ejercicio 2
        // NumerosImpares calculadora = new NumerosImpares();
        // long resultado = calculadora.productoDiezPrimerosImpares();

        // System.out.println(" El producto de los 10 primeros números impares es: " + resultado);
/**
        //Ejercicio 3
        Random random = new Random();
        int secreto = random.nextInt(10) + 1; // Número secreto entre 1 y 100
        int[] intentos = {0}; // Arreglo para contar intentos, inicializado en 0

        JuegoAdivinar juego = new JuegoAdivinar();
        int resultado = juego.jugar(secreto, intentos);

        if (resultado == -1) {
            System.out.println("Te has rendido. El número secreto era: " + secreto);
        } else {
            System.out.println("¡Ganaste en " + resultado + " intentos!");
        }
*/
        //Ejercicio 4
        Scanner scanner = new Scanner(System.in); // Para leer el límite
        Random rng = new Random(); // Para generar números aleatorios

        // Pedimos al usuario que ingrese el límite
        System.out.print("Introduce un número límite: ");
        int limite = scanner.nextInt();

        // Creamos un objeto de la clase AleatoriosPar
        AleatoriosPar generador = new AleatoriosPar();

        // Llamamos al método para obtener un número par aleatorio
        int resultado = generador.parAleatorioMenorQue(limite, rng);

        // Mostramos el resultado
        System.out.println("Número par aleatorio menor que " + limite + ": " + resultado);




        scanner.close(); // Cerramos el scanner
    }
}


