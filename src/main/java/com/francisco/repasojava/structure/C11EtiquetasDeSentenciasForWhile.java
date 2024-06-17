package com.francisco.repasojava.structure;

/**
 * El etiquetado de Sentencias, se hace a la misma altura del bucle, y estos nos sirven para
 * colocar un identificador a cada bucle y de esta manera poder definir a un break o un continue
 * a que bucle debe realizar la acción definida
 * Recordemos que el break corta la ejecución del bucle y el continue solo salta la iteración
 */
public class C11EtiquetasDeSentenciasForWhile {
    public static void main(String[] args) {
        bucle1:
        for (int i = 0; i <5; i++) {
            System.out.println();
            bucle2:
            for (int j = 0; j < 5; j++) {
                if(i == 2) {
                    continue bucle2;
                }
                System.out.print("[i = "+ i + ", j = "+ j + "], ");
            }
        }
        System.out.println("\n================================================");
        bucle3:
        for (int i = 0; i <5; i++) {
            System.out.println();
            bucle4:
            for (int j = 0; j < 5; j++) {
                if(i == 2) {
                    break bucle3;
                }
                System.out.print("[i = "+ i + ", j = "+ j + "], ");
            }
        }
    }
}
