package com.francisco.repasojava.structure;

/*
 Upcasting se refiere a transformar un tipo de dato a uno de mayor capacidad
 Downcasting se refiere a transformar un tipo de dato a uno de menor capacidad,
 este último requiere usar un cast
 */
public class C8UpcastingAndDowncasting {
    public static void main(String[] args) {
        //Upcasting
        float numeroFloat = 5f;
        double numeroDouble = numeroFloat;

        System.out.println("Upcasting " + numeroDouble);

        double numeroDouble2 = 3.5;
        float numeroFloat2 = (float) numeroDouble2;
        System.out.println("Downcasting " + numeroFloat2);
    }
}
