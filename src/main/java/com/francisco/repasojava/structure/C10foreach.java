package com.francisco.repasojava.structure;

/**
 * La sentencia foreach reconoce el numero de items del arreglo números y toma uno por uno
 * asignándolo a la variable definida en nuestro caso iterator llamado item, este debe ser del tipo de dato de cada item
 * en nuestro caso int y posterior String
 */
public class C10foreach {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 14, 15 };
        for (int item : numeros) {
            System.out.println("Num " + item);
        }

        String[] nombres = { "Moises", "Luis", "Armando", "Jesus", "Mariana"};

        for (String nombre: nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
}
