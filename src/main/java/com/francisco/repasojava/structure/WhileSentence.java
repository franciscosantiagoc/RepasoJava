package com.francisco.repasojava.structure;

import java.util.Scanner;

public class WhileSentence {
    /**
     * El ciclo while valida la condición colocada antes de ejecutar
     * el código dentro del bloque, es indispensable
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
            while(i < limit) {
                System.out.println(num + "*"+ i + "=" + (num*i));
                i++;
            }
    }
}
