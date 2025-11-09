package com.francisco.repasojava.structure;

import java.util.Scanner;

public class C21ClaseMathAreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio del circulo");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: "+area);
    }
}
