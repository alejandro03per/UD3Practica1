package com.ieschabas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /**
         //Ejercicio 1
        //System.out.println();
        //MenuVehiculos menuVehiculos = new MenuVehiculos();

        //System.out.println(menuVehiculos.seleccionarOpcion(1));

        //Ejercicio 2
        // NumerosImpares calculadora = new NumerosImpares();
        // long resultado = calculadora.productoDiezPrimerosImpares();

        // System.out.println(" El producto de los 10 primeros números impares es: " + resultado);

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

        //Ejercicio 4
        Scanner scanner = new Scanner(System.in); // Para leer el límite
        Random rng = new Random(); // Para generar números aleatorios

        // Pedimos al usuario que ingrese el límite
        System.out.print("Inserte un número límite: ");
        int limite = scanner.nextInt();

        // Creamos un objeto de la clase AleatoriosPar
        AleatoriosPar generador = new AleatoriosPar();

        // Llamamos al método para obtener un número par aleatorio
        int resultado = generador.parAleatorioMenorQue(limite, rng);

        // Mostramos el resultado
        System.out.println("Número par aleatorio menor que " + limite + ": " + resultado);

        //Ejercicio 5
        scanner.close(); // Cerramos el scanner

        SumasAleatorias sumas = new SumasAleatorias();

        // Generar las 20 sumas
        int[] resultados = sumas.generarSumas();

        // Mostrar los resultados
        System.out.println("20 sumas aleatorias: ");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Suma " + (i + 1) + ": " + resultados[i]);
        }


        //Ejercicio 6
        Scanner scanner = new Scanner(System.in);
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

        scanner.close();

        //Ejercicio 7
        Scanner scanner = new Scanner(System.in);
        Mayores mayores = new Mayores();

        // Pedir dos números al usuario
        System.out.println("Dime el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Dime el segundo número:");
        int numero2 = scanner.nextInt();

        // Calcular y mostrar el mayor
        int mayor = mayores.max2(numero1, numero2);
        System.out.println("El " +  mayor + " es el mayor");

        scanner.close();

        //Ejercicio 8
        Random rng = new Random();
        MayoresAleatorios3 mayores = new MayoresAleatorios3();

        // Generar los máximos para 20 repeticiones
        System.out.println("Calculando el mayor de tres números aleatorios 20 veces:");
        int[] resultados = mayores.generarMaximos3(20, rng);

        // Mostrar los resultados
        System.out.println("\nResultados de los mayores:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Máximo " + (i + 1) + ": " + resultados[i]);
        }
 */
        //Ejercicio 9
        Random rng = new Random();
        MayoresAleatorios4 mayores = new MayoresAleatorios4();

        // Generar los máximos para 20 repeticiones
        System.out.println("Calculando el mayor de cuatro números aleatorios 20 veces:");
        int[] resultados = mayores.generarMaximos4(20, rng);

        // Mostrar los resultados
        System.out.println("\nResultados de los mayores:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Máximo " + (i + 1) + ": " + resultados[i]);
        }


    }
}


