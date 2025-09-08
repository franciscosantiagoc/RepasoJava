package com.francisco.repasojava.structure;

import java.util.Scanner;

/*
    A diferencia del while el for exige una variable condicional o en su caso contado
    mediante el cual hará la validacion correspondiente e incremento o decremento segun
    sea necesario
* **/
public class C7LoopFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número entero de tabla a generar");
        int tabla = scanner.nextInt();
        for (int contador = 0; contador <= 10; contador++) {
            int resultado = contador * tabla;

            System.out.println(tabla + " * " + contador + " = " + resultado);
        }
    }
}
