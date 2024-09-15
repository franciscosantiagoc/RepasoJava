package com.francisco.repasojava.structure;

/**
 * El loop while a diferencia del do while, valida la conficional antes de ejecutar el codigo
 * del bloque definido internamente
 */
public class C6LoopWhile {
    public static void main(String[] args) {
        int contador = 0;
        while(contador < 10) {
            System.out.println("Contador while: " + contador);
            contador++;
        }
    }
}
