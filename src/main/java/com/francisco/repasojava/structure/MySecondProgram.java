package com.francisco.repasojava.structure;

import java.util.Scanner;

/**
 * Actividad de estanque de gasolina
 * Si la capacidad actual es 70 litros: imprimir Estanque lleno
 * Si está entre 60 y menor a 70: imprimir Estanque casi lleno
 * Si está entre 40 y menor a 60: imprimir Estanque  3/4
 * Si está entre 35 y menor a 40: imprimir Medio Estanque
 * Si está entre 20 y menor a 35: imprimir Suficiente
 * Si está entre 1 y menor a 20: imprimir Insuficiente
 */
public class MySecondProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la capacidad actual en litros");
        double capacidad = scanner.nextDouble();
        System.out.println("===================================================");
        System.out.println("=====================Resultado=====================");
        System.out.println("===================================================");
        if( capacidad == 70 ) System.out.println("Estanque lleno");
        else if( capacidad >= 60 && capacidad < 70 ) System.out.println("Estanque casi lleno");
        else if( capacidad >= 40 && capacidad < 60 )  System.out.println("Estanque 3/4");
        else if( capacidad >= 35 && capacidad < 40 ) System.out.println("Medio tanque");
        else if( capacidad >= 20 && capacidad < 35 ) System.out.println("Suficiente");
        else if ( capacidad >= 1 && capacidad < 20 ) System.out.println("Insuficiente");
        else System.out.println("No aplica");
    }
}
