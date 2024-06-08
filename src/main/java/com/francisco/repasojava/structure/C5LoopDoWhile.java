package com.francisco.repasojava.structure;

import java.util.Scanner;

public class C5LoopDoWhile {
    /**
     * El ciclo do while ejecuta el código dentro del bloque
     * siempre antes de validar la condición colocada, es indispensable
     * tener en cuenta que la variable colocada en la condición, cambie
     * de lo contrario nos enfrentaríamos en un bucle infinito
     */
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la tabla a generar");
        int num = scanner.nextInt();
        System.out.println("Introduzca el limite de la tabla");
        int limit = scanner.nextInt();
        do {
            System.out.println(num + "*"+ i + "=" + (num*i));
            i++;
        } while(i<=limit);
    }

}
