package com.francisco.repasojava.structure;

import java.util.Arrays;
import java.util.Scanner;

public class C22Arrays {
    public static void main(String[] args) {
        //el valor por defecto de un elemento string es null
        String[] productos = new String[5];
        System.out.println(productos[0]);
        productos[0] = "SSD kingstong 250GB";
        productos[1] = "Memoria Ram 16GB";
        productos[2] = "Teclado lenovo";
        productos[3] = "Monitor Game Factor";
        productos[4] = "Camara Logic tech";
        //Ordenar arreglo en orden ascendente
        Arrays.sort(productos);
        //recorrer arreglo con foreach
        for (String producto:productos) {
            System.out.println(producto);
        }

        //el valor por defecto de un elemento entero es 0
        int[] numerosFijos = new int[10];
        numerosFijos[4] = 6;
        numerosFijos[8] = 20;
        for (int i=0; i<numerosFijos.length; i++) {
            System.out.println("numero fijo " + i + ": " +numerosFijos[i]);
        }


        int[] numerosInicializados = { 9, 15, 10, 5, 2};
        int contador = 0;
        for (int numero: numerosInicializados) {
            System.out.println("numeroInic " + contador + ": " + numero);
            contador++;
        }

        Scanner scanner=new Scanner(System.in);
        final int limiteNumeros = 10;
        int[] numerosArray = new int[limiteNumeros];
        for (int j=0;j<limiteNumeros; j++) {
            System.out.println("Ingrese el numero " + (j+1));
            numerosArray[j] = scanner.nextInt();
        }

        for(int i = 0; i < numerosArray.length / 2; i++){
            int temp = numerosArray[i];
            numerosArray[i] = numerosArray[numerosArray.length - 1 - i];
            numerosArray[numerosArray.length - 1 - i] = temp;
        }

        for (int j=0;j<limiteNumeros; j++) {
            System.out.println(numerosArray[j]);
        }
    }
}
