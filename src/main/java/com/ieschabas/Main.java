package com.ieschabas;
import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1
        System.out.println("Ejercicio 1.............................................................................");
        MenuVehiculos menuVehiculos = new MenuVehiculos();

        System.out.println(menuVehiculos.seleccionarOpcion(1));

        //Ejercicio 2
        System.out.println("Ejercicio 2.............................................................................");

        NumerosImpares calculadora = new NumerosImpares();
        long resultado = calculadora.productoDiezPrimerosImpares();

        System.out.println(" El producto de los 10 primeros números impares es: " + resultado);

        //Ejercicio 3
        System.out.println("Ejercicio 3.............................................................................");

        Random random = new Random();
        int secreto = random.nextInt(10) + 1; // Número secreto entre 1 y 100
        int[] intentos = {0}; // Arreglo para contar intentos, inicializado en 0

        JuegoAdivinar juego = new JuegoAdivinar();
        int resultado1 = juego.jugar(secreto, intentos);

        if (resultado1 == -1) {
            System.out.println("Te has rendido. El número secreto era: " + secreto);
        } else {
            System.out.println("¡Ganaste en " + resultado1 + " intentos!");
        }

        //Ejercicio 4
        System.out.println("Ejercicio 4.............................................................................");

        Random rng = new Random(); // Para generar números aleatorios

        // Pedimos al usuario que ingrese el límite
        System.out.print("Inserte un número límite: ");
        int limite = scanner.nextInt();

        // Creamos un objeto de la clase AleatoriosPar
        AleatoriosPar generador = new AleatoriosPar();

        // Llamamos al método para obtener un número par aleatorio
        int resultado4 = generador.parAleatorioMenorQue(limite, rng);

        // Mostramos el resultado
        System.out.println("Número par aleatorio menor que " + limite + ": " + resultado4);

        //Ejercicio 5
        System.out.println("Ejercicio 5.............................................................................");


        SumasAleatorias sumas = new SumasAleatorias();

        // Generar las 20 sumas
        int[] resultados = sumas.generarSumas();

        // Mostrar los resultados
        System.out.println("Resultados de las sumas: ");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
        }


        //Ejercicio 6
        System.out.println("Ejercicio 6.............................................................................");

        Circunferencia circunferencia = new Circunferencia();
        double radio;

        // Pedir el radio al usuario
        System.out.println("Inserte el radio de la circunferencia:");
        radio = scanner.nextDouble();

        // Validar que el radio no sea negativo
        while (radio < 0) {
            System.out.println("El radio no puede ser un número negativo");
            System.out.println("Inserte el radio de la circunferencia:");
            radio = scanner.nextDouble();
        }

        // Calcular y mostrar el área
        double area = circunferencia.area(radio);
        System.out.println("El área de la circunferencia es: " + area);

        // Calcular y mostrar la longitud
        double longitud = circunferencia.longitud(radio);
        System.out.println("La longitud de la circunferencia es: " + longitud);



        //Ejercicio 7
        System.out.println("Ejercicio 7.............................................................................");

        Mayores mayores = new Mayores();

        // Pedir dos números al usuario
        System.out.println("Dime el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Dime el segundo número:");
        int numero2 = scanner.nextInt();

        // Calcular y mostrar el mayor
        int mayor = mayores.max2(numero1, numero2);
        System.out.println("El " +  mayor + " es el mayor");



        //Ejercicio 8
        System.out.println("Ejercicio 8.............................................................................");

        Random rng1 = new Random();
        MayoresAleatorios3 mayores1 = new MayoresAleatorios3();

        // Generar los máximos para 20 repeticiones
        System.out.println("Calculando el mayor de tres números aleatorios 20 veces:");
        int[] resultados3 = mayores1.generarMaximos3(20, rng1);

        // Mostrar los resultados
        System.out.println("\nResultados de los mayores:");
        for (int i = 0; i < resultados3.length; i++) {
            System.out.println("Máximo " + (i + 1) + ": " + resultados3[i]);
        }

        //Ejercicio 9
        System.out.println("Ejercicio 9.............................................................................");

        Random rng2 = new Random();
        MayoresAleatorios4 mayores2 = new MayoresAleatorios4();

        // Generar los máximos para 20 repeticiones
        System.out.println("Calculando el mayor de cuatro números aleatorios 20 veces:");
        int[] resultados4 = mayores2.generarMaximos4(20, rng2);

        // Mostrar los resultados
        System.out.println("\nResultados de los mayores:");
        for (int i = 0; i < resultados4.length; i++) {
            System.out.println("Máximo " + (i + 1) + ": " + resultados4[i]);
        }
    }
}


