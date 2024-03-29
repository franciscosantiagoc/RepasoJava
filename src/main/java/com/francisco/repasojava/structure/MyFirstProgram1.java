package com.francisco.repasojava.structure;

import javax.swing.*;

/**
 * The type My first program 1. El nombre de la clase debe empezar siempre por mayúscula, por lo que es recomendable usar siempre
 * la nomenclatura Pascal Case ex: MyFirstProgram y debe siempre empezar por una letra.
 * \n
 * Una clase podemos definirla como una plantilla a utilizar
 */
public class MyFirstProgram1 {

    /**
     * El método main es el que se encarga de ejecutar el programa
     */
    public static void main(String[] args) {

        System.out.println("Mi primer programa repasando java");
        //ACTIVIDAD ORDENANDO DOS NUMEROS
        
        String number1 = JOptionPane.showInputDialog(null, "Ingresa el numero 1");
        String number2 = JOptionPane.showInputDialog(null, "Ingresa el numero 2");
        
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        
        if(num1 > num2) {
            System.out.println("num1 = " + num1 + " es mayor");
            System.out.println(num1);
            System.out.println(num2);
        }else if(num2 > num1) {
            System.out.println("num2 = " + num2 + " es mayor");
            System.out.println(num2);
            System.out.println(num1);
        }else {
            System.out.println("Los numeros dados son iguales");
        }
    }
}
