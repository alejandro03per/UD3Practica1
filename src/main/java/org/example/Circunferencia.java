package org.example;

public class Circunferencia {
    // Método que calcula el área: π * radio^2
    public double area(double radio) {
        if (radio < 0) {
            System.out.println("El radio no puede ser un número negativo");
            return -1; // Valor para indicar error
        }
        return Math.PI * radio * radio;
    }

    // Método que calcula la longitud: 2 * π * radio
    public double longitud(double radio) {
        if (radio < 0) {
            System.out.println("El radio no puede ser un número negativo");
            return -1; // Valor para indicar error
        }
        return 2 * Math.PI * radio;
    }
}
