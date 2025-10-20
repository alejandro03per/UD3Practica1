package org.example;
import java.util.Scanner;

public class MenuVehiculos {
    public static String seleccionarOpcion(int opcion){
        Scanner lector = new Scanner(System.in)
        System.out.println("Inserte un numero del manú: ");
        System.out.println("1 : Mantenimiento de clientes");
        System.out.println("2 : Introducción de facturas");
        System.out.println("3 : Listado de facturas");
        System.out.println("4 : Finalizar");

        while(opcion){
            case 1 : opcion= "Mantenimiento de clientes";break;
            case 2 : opcion= "Introducción de facturas";break;
            case 3 : opcion= "Listado de facturas";break;
            case 4 : opcion= "Finalizar";break;

        }
        System.out.println("No existe opcion");
f
    }
}
