package com.francisco.repasojava.structure;

public class C9Arrays {
    /*
    * Las matrices se consideran como una colección de datos
    * del mismo tipo alineados en secuencia mediante una posición
    * iniciando desde la posición 0, existen dos formas de crear un arreglo,
    * pero estos siempre definirán un tamaño de elementos máximo al mismo
    * */
    public static void main(String[] args) {
        //Creando e inicializando un arreglo en la misma linea
        int[] arrayEnteros = new int[] {1, 2, 3, 4};
        //Creando un arreglo asignándole un tamaño y después asignar los datos
        int[] arrayEnteros2 = new int[4];
        arrayEnteros2[0] = 1;
        arrayEnteros2[1] = 3;
        arrayEnteros2[2] = 4;
        arrayEnteros2[3] = 6;

        System.out.println("Recorriendo primer arreglo sin definir tamaño");
        for (int i = 0; i < arrayEnteros.length;i++) {
            System.out.println("ArrayEnteros: " + arrayEnteros[i]);
        }

        System.out.println("Recorriendo segundo arreglo con tamaño definido");
        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.println("ArrayEnteros2: " + arrayEnteros2[i]);
        }

    }
}
