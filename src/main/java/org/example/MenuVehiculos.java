package org.example;

import java.util.Scanner;

/**
 * Programa para una aplicación de mantenimiento de vehículos.
 * Crea un menu el cual el usuario escoge la opcion que quiere
 * @author Alejandro
 * @version 1.0
 */

public class MenuVehiculos {
    public static String seleccionarOpcion(int opcion){
        //utilzo la función scanner

        Scanner scanner = new Scanner(System.in);
        //Imprime en pantalla las opciones
        System.out.println("Inserte un numero del manú: ");
        System.out.println("1 : Mantenimiento de clientes");
        System.out.println("2 : Introducción de facturas");
        System.out.println("3 : Listado de facturas");
        System.out.println("4 : Finalizar");

        opcion = scanner.nextInt();
        //Utilizo la sentencia switch para que el usuario inserte un numero y le devuelva un valor
        switch(opcion){
            case 1:
                return "Mantenimiento de clientes";
            case 2:
                return "Introducción de facturas";
            case 3:
                return "Listado de facturas";
            case 4:
                return "Finalizar";

        }
        //Si el usuario introduce un valor incorrecto imprime mensaje
        System.out.println("No existe opcion");
        return null;


    }

}
